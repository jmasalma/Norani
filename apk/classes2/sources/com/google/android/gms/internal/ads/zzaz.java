package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public class zzaz extends IOException {
    public final boolean zza;
    public final int zzb;

    protected zzaz(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.zza = z;
        this.zzb = i;
    }

    public static zzaz zza(String str, Throwable th) {
        return new zzaz(str, th, true, 1);
    }

    public static zzaz zzb(String str, Throwable th) {
        return new zzaz(str, th, true, 0);
    }

    public static zzaz zzc(String str) {
        return new zzaz(str, (Throwable) null, false, 1);
    }

    public final String getMessage() {
        String str;
        String message = super.getMessage();
        if (message != null) {
            str = message.concat(" ");
        } else {
            str = "";
        }
        boolean z = this.zza;
        int i = this.zzb;
        return str + "{contentIsMalformed=" + z + ", dataType=" + i + "}";
    }
}
