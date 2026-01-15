public enum Operation {
    ADD {
        @Override
        public int apply(int x, int y) {
            return x + y;
        }
    },
    SUBTRACT {
        @Override
        public int apply(int x, int y) {
            return x - y;
        }
    },
    MULTIPLY {
        @Override
        public int apply(int x, int y) {
            return x * y;
        }
    },
    DIVIDE {
        @Override
        public int apply(int x, int y) {
            if (y == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return x / y;
        }
    };

    public abstract int apply(int x, int y);

    public static Operation fromInt(int opCode) {
        switch (opCode) {
            case 1: return ADD;
            case 2: return SUBTRACT;
            case 3: return MULTIPLY;
            case 4: return DIVIDE;
            default: throw new IllegalArgumentException("Invalid operation code: " + opCode);
        }
    }
}
