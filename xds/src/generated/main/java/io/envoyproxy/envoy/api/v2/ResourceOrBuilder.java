// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/discovery.proto

package io.envoyproxy.envoy.api.v2;

public interface ResourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.api.v2.Resource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource level version. It allows xDS to track the state of individual
   * resources.
   * </pre>
   *
   * <code>string version = 1;</code>
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * The resource level version. It allows xDS to track the state of individual
   * resources.
   * </pre>
   *
   * <code>string version = 1;</code>
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * The resource being tracked.
   * </pre>
   *
   * <code>.google.protobuf.Any resource = 2;</code>
   */
  boolean hasResource();
  /**
   * <pre>
   * The resource being tracked.
   * </pre>
   *
   * <code>.google.protobuf.Any resource = 2;</code>
   */
  com.google.protobuf.Any getResource();
  /**
   * <pre>
   * The resource being tracked.
   * </pre>
   *
   * <code>.google.protobuf.Any resource = 2;</code>
   */
  com.google.protobuf.AnyOrBuilder getResourceOrBuilder();
}
