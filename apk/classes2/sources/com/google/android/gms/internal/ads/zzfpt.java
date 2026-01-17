package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfpt implements zzfol {
    private final Object zza;
    private final zzfpu zzb;
    private final zzfqf zzc;
    private final zzfoi zzd;

    zzfpt(Object obj, zzfpu zzfpu, zzfqf zzfqf, zzfoi zzfoi, boolean z) {
        this.zza = obj;
        this.zzb = zzfpu;
        this.zzc = zzfqf;
        this.zzd = zzfoi;
    }

    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzaug zza2 = zzauh.zza();
        zza2.zzc(5);
        zza2.zza(zzgxz.zzv(bArr, 0, bArr.length));
        return Base64.encodeToString(((zzauh) zza2.zzbr()).zzaV(), 11);
    }

    private final synchronized byte[] zzj(Map map, Map map2) {
        Object obj;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.zza;
        } catch (Exception e) {
            this.zzd.zzc(2007, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", new Class[]{Map.class, Map.class}).invoke(obj, new Object[]{null, map2});
    }

    public final synchronized String zza(Context context, String str, String str2, View view, Activity activity) {
        Map zza2;
        zza2 = this.zzc.zza();
        zza2.put("f", "c");
        zza2.put("ctx", context);
        zza2.put("cs", str2);
        zza2.put("aid", (Object) null);
        zza2.put("view", view);
        zza2.put("act", activity);
        return zzi(zzj((Map) null, zza2));
    }

    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        Map zzc2;
        zzc2 = this.zzc.zzc();
        zzc2.put("f", "v");
        zzc2.put("ctx", context);
        zzc2.put("aid", (Object) null);
        zzc2.put("view", view);
        zzc2.put("act", activity);
        return zzi(zzj((Map) null, zzc2));
    }

    public final synchronized String zzc(Context context, String str) {
        Map zzb2;
        zzb2 = this.zzc.zzb();
        zzb2.put("f", "q");
        zzb2.put("ctx", context);
        zzb2.put("aid", (Object) null);
        return zzi(zzj((Map) null, zzb2));
    }

    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzfqd {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put("aid", (Object) null);
            hashMap.put("evt", motionEvent);
            Object obj = this.zza;
            obj.getClass().getDeclaredMethod("he", new Class[]{Map.class}).invoke(obj, new Object[]{hashMap});
            this.zzd.zzd(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzfqd(2005, (Throwable) e);
        }
    }

    public final synchronized int zze() throws zzfqd {
        Object obj;
        try {
            obj = this.zza;
        } catch (Exception e) {
            throw new zzfqd(2006, (Throwable) e);
        }
        return ((Integer) obj.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(obj, new Object[0])).intValue();
    }

    /* access modifiers changed from: package-private */
    public final zzfpu zzf() {
        return this.zzb;
    }

    public final synchronized void zzg() throws zzfqd {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Object obj = this.zza;
            obj.getClass().getDeclaredMethod("close", new Class[0]).invoke(obj, new Object[0]);
            this.zzd.zzd(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzfqd(2003, (Throwable) e);
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean zzh() throws zzfqd {
        Object obj;
        try {
            obj = this.zza;
        } catch (Exception e) {
            throw new zzfqd(2001, (Throwable) e);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod("init", new Class[0]).invoke(obj, new Object[0])).booleanValue();
    }
}
