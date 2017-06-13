   assembly {
    let x := 8
    jump(two)
    one:
        // Here the stack height is 2 (because we pushed x and 7),
        // but the assembler thinks it is 1 because it reads
        // from top to bottom.
        // Accessing the stack variable x here will lead to errors.
        x := 9
        jump(three)
    two:
        7 // push something onto the stack
        jump(one)
    three:
}