package view;

import java.util.Arrays;

public enum LadderSymbol {

    BLANK(" "),
    CONNECTION("-"),
    BAR("|");

    private final String symbol;

    LadderSymbol(final String symbol) {
        this.symbol = symbol;
    }

    public static String draw(final String symbol, final int repeatedNumber) {
        return find(symbol).symbol.repeat(repeatedNumber);
    }

    private static LadderSymbol find(final String symbol) {
        return Arrays.stream(values())
                .filter(value -> value.symbol.equals(symbol))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("사다리를 만들기 위한 올바르지 않은 기호입니다."));
    }
}