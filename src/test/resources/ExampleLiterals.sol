   assembly {
            r := mul(x, sload(b_slot)) // ignore the offset, we know it is zero
        }