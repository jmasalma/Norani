package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfqe {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfqf zzc;
    private final zzfoi zzd;
    private final zzfod zze;
    private zzfpt zzf;
    private final Object zzg = new Object();

    public zzfqe(Context context, zzfqf zzfqf, zzfoi zzfoi, zzfod zzfod, boolean z) {
        this.zzb = context;
        this.zzc = zzfqf;
        this.zzd = zzfoi;
        this.zze = zzfod;
    }

    private final synchronized Class zzd(zzfpu zzfpu) throws zzfqd {
        String zzk = zzfpu.zza().zzk();
        HashMap hashMap = zza;
        Class cls = (Class) hashMap.get(zzk);
        if (cls != null) {
            return cls;
        }
        try {
            if (this.zze.zza(zzfpu.zzc())) {
                File zzb2 = zzfpu.zzb();
                if (!zzb2.exists()) {
                    zzb2.mkdirs();
                }
                Class loadClass = new DexClassLoader(zzfpu.zzc().getAbsolutePath(), zzb2.getAbsolutePath(), (String) null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                hashMap.put(zzk, loadClass);
                return loadClass;
            }
            throw new zzfqd(2026, "VM did not pass signature verification");
        } catch (GeneralSecurityException e) {
            throw new zzfqd(2026, (Throwable) e);
        } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e2) {
            throw new zzfqd(2008, e2);
        }
    }

    public final zzfol zza() {
        zzfpt zzfpt;
        synchronized (this.zzg) {
            zzfpt = this.zzf;
        }
        return zzfpt;
    }

    public final zzfpu zzb() {
        synchronized (this.zzg) {
            zzfpt zzfpt = this.zzf;
            if (zzfpt == null) {
                return null;
            }
            zzfpu zzf2 = zzfpt.zzf();
            return zzf2;
        }
    }

    public final boolean zzc(zzfpu zzfpu) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Class zzd2 = zzd(zzfpu);
            zzfpt zzfpt = new zzfpt(zzd2.getDeclaredConstructor(new Class[]{Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE}).newInstance(new Object[]{this.zzb, "msa-r", zzfpu.zze(), null, new Bundle(), 2}), zzfpu, this.zzc, this.zzd, false);
            if (zzfpt.zzh()) {
                int zze2 = zzfpt.zze();
                if (zze2 == 0) {
                    synchronized (this.zzg) {
                        zzfpt zzfpt2 = this.zzf;
                        if (zzfpt2 != null) {
                            try {
                                zzfpt2.zzg();
                            } catch (zzfqd e) {
                                zzfqd zzfqd = e;
                                this.zzd.zzc(zzfqd.zza(), -1, zzfqd);
                            }
                        }
                        this.zzf = zzfpt;
                    }
                    this.zzd.zzd(3000, System.currentTimeMillis() - currentTimeMillis);
                    return true;
                }
                throw new zzfqd(4001, "ci: " + zze2);
            }
            throw new zzfqd(4000, "init failed");
        } catch (Exception e2) {
            throw new zzfqd(2004, (Throwable) e2);
        } catch (zzfqd e3) {
            this.zzd.zzc(e3.zza(), System.currentTimeMillis() - currentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        }
    }
}
