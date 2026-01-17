package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdrn implements zzdax, zza, zzcws, zzcwc, zzcyo {
    final AtomicBoolean zza = new AtomicBoolean(false);
    final AtomicBoolean zzb = new AtomicBoolean(false);
    private final Context zzc;
    private final zzfdo zzd;
    private final zzdsj zze;
    private final zzfcn zzf;
    private final zzfca zzg;
    private final zzeca zzh;
    private final String zzi;
    private long zzj = -1;
    private Boolean zzk;
    private final boolean zzl;

    public zzdrn(Context context, zzfdo zzfdo, zzdsj zzdsj, zzfcn zzfcn, zzfca zzfca, zzeca zzeca, String str) {
        this.zzc = context;
        this.zzd = zzfdo;
        this.zze = zzdsj;
        this.zzf = zzfcn;
        this.zzg = zzfca;
        this.zzh = zzeca;
        this.zzl = ((Boolean) zzbd.zzc().zzb(zzbde.zzgZ)).booleanValue();
        this.zzi = str;
    }

    private final zzdsi zzf(String str) {
        String str2;
        zzfcn zzfcn = this.zzf;
        zzfcm zzfcm = zzfcn.zzb;
        zzdsi zza2 = this.zze.zza();
        zza2.zzd(zzfcm.zzb);
        zzfca zzfca = this.zzg;
        zza2.zzc(zzfca);
        zza2.zzb("action", str);
        zza2.zzb("ad_format", this.zzi.toUpperCase(Locale.ROOT));
        List list = zzfca.zzt;
        if (!list.isEmpty()) {
            zza2.zzb("ancn", (String) list.get(0));
        }
        if (zzfca.zzb()) {
            if (true != zzv.zzp().zzA(this.zzc)) {
                str2 = "offline";
            } else {
                str2 = "online";
            }
            zza2.zzb("device_connectivity", str2);
            zza2.zzb("event_timestamp", String.valueOf(zzv.zzD().currentTimeMillis()));
            zza2.zzb("offline_ad", "1");
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzhg)).booleanValue()) {
            boolean zzf2 = zzaa.zzf(zzfcn);
            zza2.zzb("scar", String.valueOf(zzf2));
            if (zzf2) {
                zzm zzm = zzfcn.zza.zza.zzd;
                zza2.zzb("ragent", zzm.zzp);
                zza2.zzb("rtype", zzaa.zzb(zzaa.zzc(zzm)));
            }
        }
        return zza2;
    }

    private final void zzg(zzdsi zzdsi) {
        if (this.zzg.zzb()) {
            this.zzh.zzd(new zzecc(zzv.zzD().currentTimeMillis(), this.zzf.zzb.zzb.zzb, zzdsi.zze(), 2));
            return;
        }
        zzdsi.zzj();
    }

    private final boolean zzh() {
        int i = this.zzg.zzb;
        return i == 2 || i == 5 || i == 6 || i == 7;
    }

    private final boolean zzi() {
        String str;
        if (this.zzk == null) {
            synchronized (this) {
                if (this.zzk == null) {
                    String str2 = (String) zzbd.zzc().zzb(zzbde.zzbF);
                    zzv.zzr();
                    try {
                        str = zzs.zzq(this.zzc);
                    } catch (RemoteException unused) {
                        str = null;
                    }
                    boolean z = false;
                    if (!(str2 == null || str == null)) {
                        try {
                            z = Pattern.matches(str2, str);
                        } catch (RuntimeException e) {
                            zzv.zzp().zzw(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzk = Boolean.valueOf(z);
                }
            }
        }
        return this.zzk.booleanValue();
    }

    public final void onAdClicked() {
        if (this.zzg.zzb()) {
            zzg(zzf("click"));
        }
    }

    public final void zzc(zze zze2) {
        zze zze3;
        if (this.zzl) {
            zzdsi zzf2 = zzf("ifts");
            zzf2.zzb("reason", "adapter");
            int i = zze2.zza;
            String str = zze2.zzb;
            if (zze2.zzc.equals("com.google.android.gms.ads") && (zze3 = zze2.zzd) != null && !zze3.zzc.equals("com.google.android.gms.ads")) {
                zze zze4 = zze2.zzd;
                i = zze4.zza;
                str = zze4.zzb;
            }
            if (i >= 0) {
                zzf2.zzb("arec", String.valueOf(i));
            }
            String zza2 = this.zzd.zza(str);
            if (zza2 != null) {
                zzf2.zzb("areec", zza2);
            }
            zzf2.zzj();
        }
    }

    public final void zzd() {
        if (this.zzl) {
            zzdsi zzf2 = zzf("ifts");
            zzf2.zzb("reason", "blocked");
            zzf2.zzj();
        }
    }

    public final void zzdp() {
        if (zzi()) {
            zzf("adapter_shown").zzj();
        }
    }

    public final void zzdq() {
        String str;
        if (zzi()) {
            zzdsi zzf2 = zzf("adapter_impression");
            zzf2.zzb("imp_type", String.valueOf(this.zzg.zze));
            String str2 = "1";
            if (this.zzb.get()) {
                zzf2.zzb("po", str2);
                zzf2.zzb("pil", String.valueOf(zzv.zzD().currentTimeMillis() - this.zzj));
            } else {
                zzf2.zzb("po", "0");
            }
            if (((Boolean) zzbd.zzc().zzb(zzbde.zznL)).booleanValue() && zzh()) {
                zzv.zzr();
                if (true != zzs.zzH(this.zzc)) {
                    str = str2;
                } else {
                    str = "0";
                }
                zzf2.zzb("foreground", str);
                if (true != this.zza.get()) {
                    str2 = "0";
                }
                zzf2.zzb("fg_show", str2);
            }
            zzf2.zzj();
        }
    }

    public final void zze(zzdgm zzdgm) {
        if (this.zzl) {
            zzdsi zzf2 = zzf("ifts");
            zzf2.zzb("reason", "exception");
            if (!TextUtils.isEmpty(zzdgm.getMessage())) {
                zzf2.zzb("msg", zzdgm.getMessage());
            }
            zzf2.zzj();
        }
    }

    public final void zzt() {
        if (zzi() || this.zzg.zzb()) {
            zzdsi zzf2 = zzf("impression");
            zzf2.zzb("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzj > 0) {
                zzf2.zzb("p_imp_l", String.valueOf(zzv.zzD().currentTimeMillis() - this.zzj));
            }
            if (((Boolean) zzbd.zzc().zzb(zzbde.zznL)).booleanValue() && zzh()) {
                zzv.zzr();
                String str = "1";
                zzf2.zzb("foreground", true != zzs.zzH(this.zzc) ? str : "0");
                if (true != this.zza.get()) {
                    str = "0";
                }
                zzf2.zzb("fg_show", str);
            }
            zzg(zzf2);
        }
    }

    public final void zzv() {
        String str;
        if (zzi()) {
            this.zzb.set(true);
            this.zzj = zzv.zzD().currentTimeMillis();
            zzdsi zzf2 = zzf("presentation");
            if (((Boolean) zzbd.zzc().zzb(zzbde.zznL)).booleanValue() && zzh()) {
                AtomicBoolean atomicBoolean = this.zza;
                zzv.zzr();
                atomicBoolean.set(!zzs.zzH(this.zzc));
                if (true != atomicBoolean.get()) {
                    str = "0";
                } else {
                    str = "1";
                }
                zzf2.zzb("foreground", str);
            }
            zzf2.zzj();
        }
    }
}
