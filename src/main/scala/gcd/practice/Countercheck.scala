<<<<<<< HEAD
// package prac
// import chisel3._
// import chisel3.util._
// import java.io.File

// class counter_up_down ( n : Int ) extends Module {
// val io = IO (new Bundle {
//     val data_in = Input ( UInt ( n . W ) )
//     val reload = Input ( Bool () )
//     val out = Output ( Bool () )
// })


// def updowncounter(max:Int) = {
//     io.out :=false.B
//     val counter = RegInit(0.U(5.W))
//     when(io.out) {
//       counter := counter - 1.U
//     }
//     .otherwise {
//       counter := counter + 1.U
//     }

//     when(counter === (max-1).asUInt) {
//       io.out := true.B
//     }
//     .otherwise{
//         io.out:=false.B
//     }
    
// counter
// }

// val countercheck = updowncounter(n)
// }

=======
// package prac
// import chisel3._
// import chisel3.util._
// import java.io.File

// class counter_up_down ( n : Int ) extends Module {
// val io = IO (new Bundle {
//     val data_in = Input ( UInt ( n . W ) )
//     val reload = Input ( Bool () )
//     val out = Output ( Bool () )
// })


// def updowncounter(max:Int) = {
//     io.out :=false.B
//     val counter = RegInit(0.U(5.W))
//     when(io.out) {
//       counter := counter - 1.U
//     }
//     .otherwise {
//       counter := counter + 1.U
//     }

//     when(counter === (max-1).asUInt) {
//       io.out := true.B
//     }
//     .otherwise{
//         io.out:=false.B
//     }
    
// counter
// }

// val countercheck = updowncounter(n)
// }

>>>>>>> 2e1319e6bffb73bba5864a2df60603b04df9c27a
