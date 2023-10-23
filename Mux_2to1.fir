;buildInfoPackage: chisel3, version: 3.4.3, scalaVersion: 2.12.12, sbtVersion: 1.3.10
circuit Mux_2to1 : 
  module Mux_2to1 : 
    input clock : Clock
    input reset : UInt<1>
    output io : {flip in_A : UInt<32>, flip in_B : UInt<32>, flip select : UInt<1>, out : UInt}
    
    node _io_out_T = and(io.in_A, io.select) @[Ex1.scala 15:23]
    node _io_out_T_1 = not(io.select) @[Ex1.scala 15:52]
    node _io_out_T_2 = and(io.in_B, _io_out_T_1) @[Ex1.scala 15:49]
    node _io_out_T_3 = or(_io_out_T, _io_out_T_2) @[Ex1.scala 15:37]
    io.out <= _io_out_T_3 @[Ex1.scala 15:10]
    
