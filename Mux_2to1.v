module Mux_2to1(
  input         clock,
  input         reset,
  input  [31:0] io_in_A,
  input  [31:0] io_in_B,
  input         io_select,
  output [31:0] io_out
);
  wire [31:0] _GEN_0 = {{31'd0}, io_select}; // @[Ex1.scala 15:23]
  wire [31:0] _io_out_T = io_in_A & _GEN_0; // @[Ex1.scala 15:23]
  wire  _io_out_T_1 = ~io_select; // @[Ex1.scala 15:52]
  wire [31:0] _GEN_1 = {{31'd0}, _io_out_T_1}; // @[Ex1.scala 15:49]
  wire [31:0] _io_out_T_2 = io_in_B & _GEN_1; // @[Ex1.scala 15:49]
  assign io_out = _io_out_T | _io_out_T_2; // @[Ex1.scala 15:37]
endmodule
