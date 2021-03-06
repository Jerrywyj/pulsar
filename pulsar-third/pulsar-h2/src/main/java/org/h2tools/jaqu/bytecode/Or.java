/*
 * Copyright 2004-2014 H2 Group. Multiple-Licensed under the MPL 2.0,
 * and the EPL 1.0 (http://h2database.com/html/license.html).
 * Initial Developer: H2 Group
 */
package org.h2tools.jaqu.bytecode;

import org.h2tools.jaqu.Query;
import org.h2tools.jaqu.SQLStatement;
import org.h2tools.jaqu.Token;

/**
 * An OR expression.
 */
public class Or implements Token {

    private final Token left, right;

    private Or(Token left, Token right) {
        this.left = left;
        this.right = right;
    }

    static Or get(Token left, Token right) {
        return new Or(left, right);
    }

    @Override
    public <T> void appendSQL(SQLStatement stat, Query<T> query) {
        // untested
        left.appendSQL(stat, query);
        stat.appendSQL(" OR ");
        right.appendSQL(stat, query);
    }

}
