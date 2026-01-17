package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public class zzha extends zzgk {
    public final int zzb;

    public zzha(zzgo zzgo, int i, int i2) {
        super(zzb(2008, 1));
        this.zzb = 1;
    }

    public static zzha zza(IOException iOException, zzgo zzgo, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else {
            i2 = (message == null || !zzfuv.zza(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        if (i2 == 2007) {
            return new zzgz(iOException, zzgo);
        }
        return new zzha(iOException, zzgo, i2, i);
    }

    private static int zzb(int i, int i2) {
        return i == 2000 ? i2 != 1 ? 2000 : 2001 : i;
    }

    public zzha(IOException iOException, zzgo zzgo, int i, int i2) {
        super((Throwable) iOException, zzb(i, i2));
        this.zzb = i2;
    }

    public zzha(String str, zzgo zzgo, int i, int i2) {
        super(str, zzb(i, i2));
        this.zzb = i2;
    }

    public zzha(String str, IOException iOException, zzgo zzgo, int i, int i2) {
        super(str, iOException, zzb(i, i2));
        this.zzb = i2;
    }
}
