package com.myorg

import software.amazon.awscdk.core.{Construct, Stack, StackProps}

class ScalaCdkStack(val scope: Construct, val id: String, val props: StackProps)
  extends Stack(scope, id, props) {
  def this(scope: Construct, id: String) = {
    this(scope, id, null)
  }
}
