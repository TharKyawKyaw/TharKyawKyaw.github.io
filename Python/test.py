from cgi import test


def double(x):
    return 2*x


def test_double():
    x = 4
    expected = 8
    computed = double(x)
    success = computed == expected
    msg = 'Computed %s , excepted %s' % (computed, expected)
    assert success, msg


def main():
    test_double()


main()
