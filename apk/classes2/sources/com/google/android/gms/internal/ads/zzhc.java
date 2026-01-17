package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzhc extends zzha {
    public final int zzc;

    public zzhc(int i, String str, IOException iOException, Map map, zzgo zzgo, byte[] bArr) {
        super("Response code: " + i, iOException, zzgo, 2004, 1);
        this.zzc = i;
    }
}
