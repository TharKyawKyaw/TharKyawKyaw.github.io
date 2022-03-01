def double(x):
    return 2*x


def test_double():
    tol = 1E-14
    x_values = [3, 7, -2, 0, 4.5]
    expected_value = [6, 14, -4, 0, 9.1]
    for x, expected in zip(x_values, expected_value):
        computed = double(x)
        msg = '%s != %s' % (computed, expected)
        assert abs(expected-computed) < tol, msg


def main():
    test_double()


main()
