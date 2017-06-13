assembly {
    function power(base, exponent) -> result {
        switch exponent
         0: { result := 1 }
         1: { result := base }
        default: {
            result := power(mul(base, base), div(exponent, 2))
            switch mod(exponent, 2)
                1: { result := mul(base, result) }
        }
    }
}