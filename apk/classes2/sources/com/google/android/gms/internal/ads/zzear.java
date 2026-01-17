package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzear implements zzgdj {
    final /* synthetic */ zzfge zza;

    zzear(zzeas zzeas, zzfge zzfge) {
        this.zza = zzfge;
        Objects.requireNonNull(zzeas);
    }

    public final void zza(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        int i = zze.zza;
        zzo.zzg("Failed to get offline signal database: ".concat(valueOf));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            int i = zze.zza;
            zzo.zzg("Error executing function on offline signal database: ".concat(valueOf));
        }
    }
}
