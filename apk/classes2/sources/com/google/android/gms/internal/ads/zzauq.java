package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzauq implements Runnable {
    private zzauq() {
        throw null;
    }

    /* synthetic */ zzauq(zzaur zzaur) {
    }

    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzaus.zzd = MessageDigest.getInstance("MD5");
            countDownLatch = zzaus.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzaus.zzb;
        } catch (Throwable th) {
            zzaus.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
