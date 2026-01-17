package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzayj {
    private final zzawx zza;
    private final String zzb;
    private final String zzc;
    private volatile Method zzd = null;
    private final Class[] zze;
    private final CountDownLatch zzf = new CountDownLatch(1);

    public zzayj(zzawx zzawx, String str, String str2, Class... clsArr) {
        this.zza = zzawx;
        this.zzb = str;
        this.zzc = str2;
        this.zze = clsArr;
        zzawx.zzj().submit(new zzayi(this));
    }

    static /* bridge */ /* synthetic */ void zzb(zzayj zzayj) {
        try {
            zzawx zzawx = zzayj.zza;
            Class loadClass = zzawx.zzh().loadClass(zzayj.zzc(zzawx.zzs(), zzayj.zzb));
            if (loadClass != null) {
                zzayj.zzd = loadClass.getMethod(zzayj.zzc(zzawx.zzs(), zzayj.zzc), zzayj.zze);
                Method method = zzayj.zzd;
            }
        } catch (zzawb | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th) {
            zzayj.zzf.countDown();
            throw th;
        }
        zzayj.zzf.countDown();
    }

    private final String zzc(byte[] bArr, String str) throws zzawb, UnsupportedEncodingException {
        return new String(this.zza.zze().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.zzd != null) {
            return this.zzd;
        }
        try {
            if (!this.zzf.await(2, TimeUnit.SECONDS)) {
                return null;
            }
            return this.zzd;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
