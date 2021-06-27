package com.myorg

import software.amazon.awscdk.core.App
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature

import java.io.IOException

import org.junit.Test
import org.junit.Assert.*
import org.assertj.core.api.Assertions.assertThat

object ScalaCdkTest {
  private val JSON = new ObjectMapper().configure(SerializationFeature.INDENT_OUTPUT, true)
}

class ScalaCdkTest:
  @Test def testStack(): Unit = {
    val app = new App
    val stack = new ScalaCdkStack(app, "test")

    val template = app.synth.getStackArtifact(stack.getArtifactId).getTemplate
    // synthesize the stack to a CloudFormation template
    val actual: JsonNode = ScalaCdkTest.JSON.valueToTree(template)

    // Update once resources have been added to the stack
    assertThat(actual.get("Resources")).isNull()
  }

