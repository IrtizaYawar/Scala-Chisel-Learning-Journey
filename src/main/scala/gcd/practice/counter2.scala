<<<<<<< HEAD
// package  practice
// import chisel3.util._
// import chisel3._

// class Counter2 ( counterBits : UInt ) extends Module {
// val io = IO (new Bundle {
//     val result = Output ( Bool () )
// })
// val max = (1.U << counterBits ) - 1.U
// val count = RegInit (0.U (16.W ))
// println ( s"counter created with max value $count ")
// io . result :=0.B 
// when ( count === max  ) {
//     count := 0.U
//     io.result:=1.B 
// }.otherwise {
//     println("here")
//     count := count + 1.U
// }
=======
// package  practice
// import chisel3.util._
// import chisel3._

// class Counter2 ( counterBits : UInt ) extends Module {
// val io = IO (new Bundle {
//     val result = Output ( Bool () )
// })
// val max = (1.U << counterBits ) - 1.U
// val count = RegInit (0.U (16.W ))
// println ( s"counter created with max value $count ")
// io . result :=0.B 
// when ( count === max  ) {
//     count := 0.U
//     io.result:=1.B 
// }.otherwise {
//     println("here")
//     count := count + 1.U
// }
>>>>>>> 2e1319e6bffb73bba5864a2df60603b04df9c27a
// println ( s" counter created with max value $max ")}