package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.zzv;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfhl implements zzfhj {
    private final Context zza;
    /* access modifiers changed from: private */
    public long zzb = 0;
    /* access modifiers changed from: private */
    public long zzc = -1;
    /* access modifiers changed from: private */
    public boolean zzd = false;
    /* access modifiers changed from: private */
    public int zze = 0;
    /* access modifiers changed from: private */
    public String zzf = "";
    /* access modifiers changed from: private */
    public String zzg = "";
    /* access modifiers changed from: private */
    public String zzh = "";
    /* access modifiers changed from: private */
    public String zzi = "";
    /* access modifiers changed from: private */
    public zzfhz zzj = zzfhz.SCAR_REQUEST_TYPE_UNSPECIFIED;
    /* access modifiers changed from: private */
    public String zzk = "";
    /* access modifiers changed from: private */
    public String zzl = "";
    /* access modifiers changed from: private */
    public String zzm = "";
    private boolean zzn = false;
    private boolean zzo = false;
    /* access modifiers changed from: private */
    public final int zzp;
    /* access modifiers changed from: private */
    public int zzq = 2;
    /* access modifiers changed from: private */
    public int zzr = 2;

    zzfhl(Context context, int i) {
        this.zza = context;
        this.zzp = i;
    }

    public final synchronized zzfhl zzA() {
        this.zzc = zzv.zzD().elapsedRealtime();
        return this;
    }

    public final synchronized zzfhl zzK(int i) {
        this.zzq = i;
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfhj zza(zze zze2) {
        zzr(zze2);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfhj zzb(zzfcm zzfcm) {
        zzs(zzfcm);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfhj zzc(String str) {
        zzt(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfhj zzd(String str) {
        zzu(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfhj zze(String str) {
        zzv(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfhj zzf(zzfhz zzfhz) {
        zzw(zzfhz);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfhj zzg(boolean z) {
        zzx(z);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfhj zzh(Throwable th) {
        zzy(th);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfhj zzi() {
        zzz();
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfhj zzj() {
        zzA();
        return this;
    }

    public final synchronized boolean zzk() {
        return this.zzo;
    }

    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzh);
    }

    public final synchronized zzfhn zzm() {
        if (this.zzn) {
            return null;
        }
        this.zzn = true;
        if (!this.zzo) {
            zzz();
        }
        if (this.zzc < 0) {
            zzA();
        }
        return new zzfhn(this, (zzfhm) null);
    }

    public final /* bridge */ /* synthetic */ zzfhj zzn(int i) {
        zzK(i);
        return this;
    }

    public final synchronized zzfhl zzr(zze zze2) {
        IBinder iBinder = zze2.zze;
        if (iBinder != null) {
            zzcvr zzcvr = (zzcvr) iBinder;
            String zzl2 = zzcvr.zzl();
            if (!TextUtils.isEmpty(zzl2)) {
                this.zzf = zzl2;
            }
            String zzi2 = zzcvr.zzi();
            if (!TextUtils.isEmpty(zzi2)) {
                this.zzg = zzi2;
            }
        }
        return this;
    }

    public final synchronized zzfhl zzs(zzfcm zzfcm) {
        String str = zzfcm.zzb.zzb;
        if (!TextUtils.isEmpty(str)) {
            this.zzf = str;
        }
        Iterator it = zzfcm.zza.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str2 = ((zzfca) it.next()).zzab;
            if (!TextUtils.isEmpty(str2)) {
                this.zzg = str2;
                break;
            }
        }
        return this;
    }

    public final synchronized zzfhl zzt(String str) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzjj)).booleanValue()) {
            this.zzm = str;
        }
        return this;
    }

    public final synchronized zzfhl zzu(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfhl zzv(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfhl zzw(zzfhz zzfhz) {
        this.zzj = zzfhz;
        return this;
    }

    public final synchronized zzfhl zzx(boolean z) {
        this.zzd = z;
        return this;
    }

    public final synchronized zzfhl zzy(Throwable th) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzjj)).booleanValue()) {
            this.zzl = zzbun.zzf(th);
            this.zzk = (String) zzfwe.zzb(zzfva.zzc(10)).zzd(zzbun.zze(th)).iterator().next();
        }
        return this;
    }

    public final synchronized zzfhl zzz() {
        zzaa zzs = zzv.zzs();
        Context context = this.zza;
        this.zze = zzs.zzm(context);
        Resources resources = context.getResources();
        int i = 2;
        if (resources != null) {
            Configuration configuration = resources.getConfiguration();
            if (configuration != null) {
                i = configuration.orientation == 2 ? 4 : 3;
            }
        }
        this.zzr = i;
        this.zzb = zzv.zzD().elapsedRealtime();
        this.zzo = true;
        return this;
    }
}
