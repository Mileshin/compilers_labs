package ifmo.labs.compilers.lab1;

/**
 * Created by Andrey on 14.11.2017.
 */

enum LexType {
    Const(0),
    Id(1),
    Unary(2),
    Additive(3),
    Multiplicative(4),
    Logical(5),
    Assignment(6),
    Delimiter(7),
    OpenBracket(8),
    CloseBracket(9),
    Error(10),
    EOF(11),
    KeyWord(1000);
    int val;

    LexType(int i) {
        val = i;
    }
}


class Lexeme {
    final int id;
    final int type;
    final int lineNum;
    final String word;

    Lexeme(int id, int type, int lineNum, String word) {
        this.id = id;
        this.type = type;
        this.lineNum = lineNum;
        this.word = word;
    }

    @Override
    public String toString() {
        if (type == LexType.Error.val) {
            return "<" + word + ";" + type/* + ";" + lineNum */ + ">";
        } else {
            return "<" + id + ";" + type/* + ";" + lineNum */ + ">";
        }
    }
}

