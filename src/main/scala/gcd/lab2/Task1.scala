// package Lab2
// import chisel3 . _
// import chisel3.util._
// class LM_IO_Interface extends Bundle {
//     val sel = Input (UInt (3.W) )
// // val s1 = Input ( Bool () )
// // val s2 = Input ( Bool () )
// val out = Output ( UInt (32. W ) )
// }
// class Mux_5to1 extends Module {
// val io = IO (new LM_IO_Interface )
// // Start coding here
// io . out := MuxCase ( false .B , Array (
// ( io . sel ===0. U ) (0.U) -> 0.U,
// ( io . sel ===1. U ) (1.U) -> 8.U,
// ( io . sel ===2. U ) (2.U) -> 16.U,
// ( io . sel ===3. U ) (3.U) -> 24.U,
// ( io . sel ===4. U ) (4.U) -> 32.U,
// ( io . sel ===5. U ) (4.U) -> 32.U,
// ( io . sel ===6. U ) (4.U) -> 32.U,
// ( io . sel ===7. U ) (4.U) -> 32.U,
// )
// )
// }



// // io.out:= MuxLookup( io . sel , false .B , Array (
// // (0.U) -> 0.U,
// // (1.U) -> 8.U,
// // (2.U) -> 16.U,
// // (3.U) -> 24.U,
// // (4.U) -> 32.U,
// // (5.U) -> 32.U,
// // (6.U) -> 32.U,
// // (7.U) -> 32.U
// // ))
// // // End your code here

// // // println (( new chisel3 . stage . ChiselStage ) . emitVerilog (new Mux_5to1 ) ),