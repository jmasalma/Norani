package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzcdn implements Releasable {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzcdn(zzccb zzccb) {
        Context context = zzccb.getContext();
        this.zza = context;
        this.zzb = zzv.zzr().zzc(context, zzccb.zzm().afmaVersion);
        this.zzc = new WeakReference(zzccb);
    }

    static /* bridge */ /* synthetic */ void zze(zzcdn zzcdn, String str, Map map) {
        zzccb zzccb = (zzccb) zzcdn.zzc.get();
        if (zzccb != null) {
            zzccb.zzd("onPrecacheEvent", map);
        }
    }

    public void release() {
    }

    public abstract void zzf();

    public final void zzg(String str, String str2, String str3, String str4) {
        zzf.zza.post(new zzcdm(this, str, str2, str3, str4));
    }

    /* access modifiers changed from: protected */
    public final void zzh(String str, String str2, int i) {
        zzf.zza.post(new zzcdk(this, str, str2, i));
    }

    public final void zzj(String str, String str2, long j) {
        zzf.zza.post(new zzcdl(this, str, str2, j));
    }

    public final void zzn(String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        zzf.zza.post(new zzcdj(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    public final void zzo(String str, String str2, long j, long j2, boolean z, long j3, long j4, long j5, int i, int i2) {
        Handler handler = zzf.zza;
        zzcdi zzcdi = r0;
        zzcdi zzcdi2 = new zzcdi(this, str, str2, j, j2, j3, j4, j5, z, i, i2);
        handler.post(zzcdi);
    }

    /* access modifiers changed from: protected */
    public void zzp(int i) {
    }

    /* access modifiers changed from: protected */
    public void zzq(int i) {
    }

    /* access modifiers changed from: protected */
    public void zzr(int i) {
    }

    /* access modifiers changed from: protected */
    public void zzs(int i) {
    }

    public abstract boolean zzt(String str);

    public boolean zzu(String str, String[] strArr) {
        return zzt(str);
    }

    public boolean zzw(String str, String[] strArr, zzcdf zzcdf) {
        return zzt(str);
    }
}
