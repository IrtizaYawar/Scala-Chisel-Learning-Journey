package lab2
import chisel3 . _
import scala.language.postfixOps
// Mux IO interface class
class Mux_2to1_IO extends Bundle {
val in_A = Input ( UInt (32. W ) )
val in_B = Input ( UInt (32. W ) )
val select = Input ( Bool () )
val out = Output ( UInt () )
}
// 2 to 1 Mux implementation
class Mux_2to1 extends Module {
val io = IO (new Mux_2to1_IO )
// update the output
io . out := io . in_A & io . select | io . in_B & (~ io . select )
}
// println (( new chisel3 . stage . ChiselStage ) . emitVerilog (new Mux_2to1 () ) )
object Main extends App{
    println((new chisel3.stage.ChiselStage).emitVerilog(new Mux_2to1))
}