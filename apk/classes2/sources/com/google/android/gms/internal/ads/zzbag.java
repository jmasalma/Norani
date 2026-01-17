package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import kotlin.io.ConstantsKt;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbag {
    ByteArrayOutputStream zza = new ByteArrayOutputStream(ConstantsKt.DEFAULT_BLOCK_SIZE);
    Base64OutputStream zzb = new Base64OutputStream(this.zza, 10);

    public final String toString() {
        String str;
        try {
            this.zzb.close();
        } catch (IOException e) {
            int i = zze.zza;
            zzo.zzh("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.zza.close();
            str = this.zza.toString();
        } catch (IOException e2) {
            int i2 = zze.zza;
            zzo.zzh("HashManager: Unable to convert to Base64.", e2);
            str = "";
        } catch (Throwable th) {
            this.zza = null;
            this.zzb = null;
            throw th;
        }
        this.zza = null;
        this.zzb = null;
        return str;
    }
}
