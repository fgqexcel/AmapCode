package com.alibaba.sqlcrypto.sqlite;

import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.ParcelFileDescriptor;

public final class SQLiteStatement extends SQLiteProgram {
    SQLiteStatement(SQLiteDatabase db, String sql, Object[] bindArgs) {
        super(db, sql, bindArgs, null);
    }

    public final void execute() {
        acquireReference();
        try {
            getSession().execute(getSql(), getBindArgs(), getConnectionFlags(), null);
            releaseReference();
        } catch (SQLiteDatabaseCorruptException ex) {
            onCorruption();
            throw ex;
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }

    public final int executeUpdateDelete() {
        acquireReference();
        try {
            int executeForChangedRowCount = getSession().executeForChangedRowCount(getSql(), getBindArgs(), getConnectionFlags(), null);
            releaseReference();
            return executeForChangedRowCount;
        } catch (SQLiteDatabaseCorruptException ex) {
            onCorruption();
            throw ex;
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }

    public final long executeInsert() {
        acquireReference();
        try {
            long executeForLastInsertedRowId = getSession().executeForLastInsertedRowId(getSql(), getBindArgs(), getConnectionFlags(), null);
            releaseReference();
            return executeForLastInsertedRowId;
        } catch (SQLiteDatabaseCorruptException ex) {
            onCorruption();
            throw ex;
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }

    public final long simpleQueryForLong() {
        acquireReference();
        try {
            long executeForLong = getSession().executeForLong(getSql(), getBindArgs(), getConnectionFlags(), null);
            releaseReference();
            return executeForLong;
        } catch (SQLiteDatabaseCorruptException ex) {
            onCorruption();
            throw ex;
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }

    public final String simpleQueryForString() {
        acquireReference();
        try {
            String executeForString = getSession().executeForString(getSql(), getBindArgs(), getConnectionFlags(), null);
            releaseReference();
            return executeForString;
        } catch (SQLiteDatabaseCorruptException ex) {
            onCorruption();
            throw ex;
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }

    public final ParcelFileDescriptor simpleQueryForBlobFileDescriptor() {
        acquireReference();
        try {
            ParcelFileDescriptor executeForBlobFileDescriptor = getSession().executeForBlobFileDescriptor(getSql(), getBindArgs(), getConnectionFlags(), null);
            releaseReference();
            return executeForBlobFileDescriptor;
        } catch (SQLiteDatabaseCorruptException ex) {
            onCorruption();
            throw ex;
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }

    public final String toString() {
        return "SQLiteProgram: " + getSql();
    }
}
