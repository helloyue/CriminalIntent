package database.CrimeDbSchema;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.technology.carrot.criminalintent.Crime;

import java.util.Date;
import java.util.UUID;

import database.CrimeDbSchema.CrimeDbSchema.CrimeTable;

/**
 * Created by Administrator on 2018/1/20.
 */

public class CrimeCursorWrapper extends CursorWrapper {
    public CrimeCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public Crime getCrime() {
        String uuidString = getString(getColumnIndex(CrimeTable.Cols.UUID));
        String title = getString(getColumnIndex(CrimeTable.Cols.TITLE));
        long date = getLong(getColumnIndex(CrimeTable.Cols.DATE));
        int isSolve = getInt(getColumnIndex(CrimeTable.Cols.SOLVE));
        String suspect = getString(getColumnIndex(CrimeTable.Cols.SUSPECT));

        Crime crime = new Crime(UUID.fromString(uuidString));
        crime.setTitle(title);
        crime.setDate(new Date(date));
        crime.setSolved(isSolve !=0);
        crime.setSuspect(suspect);
        return crime;
       // return null;

    }

}
