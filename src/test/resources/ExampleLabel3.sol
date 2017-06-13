   assembly {
    let x := 8
    jump(two)
    0 // This code is unreachable but will adjust the stack height correctly
    one:
        x := 9 // Now x can be accessed properly.
        jump(three)
        pop // Similar negative correction.
    two:
        7 // push something onto the stack
        jump(one)
    three:
    pop // We have to pop the manually pushed value here again.
}