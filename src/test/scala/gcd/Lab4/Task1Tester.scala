// package Lab4

// import chisel3 . _
// import chisel3 . util
// Import org . scalatest . _
// import chiseltest . _
// import chiseltest . experimental . TestOptionBuilder . _
// import chiseltest . internal . VerilatorBackendAnnotation
// import scala . util . Random
// import ALUOP . _
// class branchtest( c : ALU ) extends FreeSpec with ChiselScalaTester {
// “Branch ” in {
// test ( new ALU ) . withAnnotations( Seq ( VerilatorBackendAnnotation ) ) { c =>
// // ALU operations
// val array_op = Array ( beq ,bne , blt , bltu, bge,bgeu  )
// for ( i <- 0 until 100) {
// val src_a = Random . nextLong () & 0 xFFFFFFFFL
// val src_b = Random . nextLong () & 0 xFFFFFFFFL
// val opr = Random . nextInt (12)
// val aluop = array_op ( opr )
// // ALU functional implementation using Scala match
//     val result = aluop match {
// case ALU_ADD = > src_a + src_b
// case ALU_SUB = > src_a - src_b
// case ALU_AND = > src_a & src_b
// case ALU_OR = > src_a | src_b
// case ALU_XOR = > src_a ^ src_b
// case ALU_SLT = > ( src_a . toInt < src_b . toInt ) . asInstanceOf [ Int ]
// case ALU_SLL = > src_a << ( src_b & 0 x1F )
// case ALU_SLTU = > ( src_a < src_b ) . asInstanceOf [ Int ]
// case ALU_SRL = > src_a > > ( src_b & 0 x1F )
// case ALU_SRA = > src_a . toInt > > ( src_b & 0 x1F )
// case ALU_COPY_A = > src_a
// case ALU_COPY_B = > src_b
// case _ = > 0
// }
// val result1 : BigInt = if ( result < 0)
// ( BigInt (0 xFFFFFFFFL ) + result +1) & 0 xFFFFFFFFL
// else result & 0 xFFFFFFFFL
// c . io . in_A . poke ( src_a . U )
// c . io . in_B . poke ( src_b . U )
// c . io . alu_Op . poke ( aluop )
// c . clock . step (1)
// c . io . out . expect ( result1 . asUInt )
// }
// c . clock . step (2)
// }
// }
// }
