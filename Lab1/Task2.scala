package Lab1
import chisel3 . _
import chisel3 . util . _
import java . io . File
class Task2() extends Module {
val io = IO (new Bundle {
// val data_in = Input ( UInt ( n . W ) )
val reload = Output ( Bool () )
// val out = Output ( Bool () )
})
val counter = RegInit (0. U(4.W)  )
val max_count = RegInit (6. U (4.W) )
io.reload:=0.B
when(io.reload) {
counter := counter - 1.U
}
.otherwise{
counter := counter + 1.U
} 
when(counter === max_count) {
io.reload := 1.B
// io.out := 1.B
}
.otherwise{
// io.out:=0.B
io.reload := 0.B
}
}