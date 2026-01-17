package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeca extends zzfqw {
    private final Context zza;
    private final zzgdy zzb;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzeca(android.content.Context r8, com.google.android.gms.internal.ads.zzgdy r9) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zziL
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r5 = r0.intValue()
            r4 = 0
            com.google.android.gms.internal.ads.zzfqy r6 = com.google.android.gms.internal.ads.zzfqy.zza
            java.lang.String r3 = "AdMobOfflineBufferedPings.db"
            r1 = r7
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r7.zza = r8
            r7.zzb = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeca.<init>(android.content.Context, com.google.android.gms.internal.ads.zzgdy):void");
    }

    public static /* synthetic */ Void zza(zzeca zzeca, zzecc zzecc, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzecc.zza));
        contentValues.put("gws_query_id", zzecc.zzb);
        contentValues.put("url", zzecc.zzc);
        contentValues.put("event_state", Integer.valueOf(zzecc.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", (String) null, contentValues);
        zzv.zzr();
        Context context = zzeca.zza;
        zzbr zzA = zzs.zzA(context);
        if (zzA != null) {
            try {
                zzA.zze(ObjectWrapper.wrap(context));
            } catch (RemoteException e) {
                zze.zzb("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }

    static /* synthetic */ void zzf(SQLiteDatabase sQLiteDatabase, String str, zzu zzu) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, zzu);
    }

    static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    /* access modifiers changed from: private */
    public static void zzj(SQLiteDatabase sQLiteDatabase, zzu zzu) {
        String str;
        sQLiteDatabase.beginTransaction();
        try {
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{"timestamp", "url"}, "event_state = 1", (String[]) null, (String) null, (String) null, "timestamp ASC", (String) null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex("timestamp");
                int columnIndex2 = query.getColumnIndex("url");
                if (columnIndex2 != -1) {
                    long j = query.getLong(columnIndex);
                    String string = query.getString(columnIndex2);
                    if (string == null) {
                        str = "";
                    } else {
                        Uri parse = Uri.parse(string);
                        String encodedQuery = parse.getEncodedQuery();
                        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                        clearQuery.appendQueryParameter("bd", Long.toString(zzv.zzD().currentTimeMillis() - j));
                        str = String.valueOf(clearQuery.build()) + "&" + encodedQuery;
                    }
                    strArr[i] = str;
                }
                i++;
            }
            query.close();
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            try {
                sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                for (int i2 = 0; i2 < count; i2++) {
                    zzu.zza(strArr[i2]);
                }
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            SQLiteDatabase sQLiteDatabase3 = sQLiteDatabase;
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final void zzc(String str) {
        zze(new zzeby(this, str));
    }

    public final void zzd(zzecc zzecc) {
        zze(new zzebu(this, zzecc));
    }

    /* access modifiers changed from: package-private */
    public final void zze(zzfge zzfge) {
        zzebw zzebw = new zzebw(this);
        zzgdy zzgdy = this.zzb;
        zzgdn.zzr(zzgdy.zzb(zzebw), new zzebz(this, zzfge), zzgdy);
    }

    /* access modifiers changed from: package-private */
    public final void zzg(SQLiteDatabase sQLiteDatabase, zzu zzu, String str) {
        this.zzb.execute(new zzebx(sQLiteDatabase, str, zzu));
    }

    public final void zzh(zzu zzu, String str) {
        zze(new zzebv(this, zzu, str));
    }
}
