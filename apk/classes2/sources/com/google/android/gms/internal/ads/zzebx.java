package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.util.client.zzu;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzebx implements Runnable {
    public final /* synthetic */ SQLiteDatabase zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzu zzc;

    public /* synthetic */ zzebx(SQLiteDatabase sQLiteDatabase, String str, zzu zzu) {
        this.zza = sQLiteDatabase;
        this.zzb = str;
        this.zzc = zzu;
    }

    public final void run() {
        zzeca.zzf(this.zza, this.zzb, this.zzc);
    }
}
