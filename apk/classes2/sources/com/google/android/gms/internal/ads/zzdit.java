package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.client.zzfa;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdit {
    private int zza;
    private zzed zzb;
    private zzbgi zzc;
    private View zzd;
    private List zze;
    private List zzf = Collections.emptyList();
    private zzfa zzg;
    private Bundle zzh;
    private zzcfg zzi;
    private zzcfg zzj;
    private zzcfg zzk;
    private zzedh zzl;
    private ListenableFuture zzm;
    private zzcak zzn;
    private View zzo;
    private View zzp;
    private IObjectWrapper zzq;
    private double zzr;
    private zzbgp zzs;
    private zzbgp zzt;
    private String zzu;
    private final SimpleArrayMap zzv = new SimpleArrayMap();
    private final SimpleArrayMap zzw = new SimpleArrayMap();
    private float zzx;
    private String zzy;

    public static zzdit zzag(zzbqb zzbqb) {
        try {
            zzdis zzak = zzak(zzbqb.zzg(), (zzbqf) null);
            zzbgi zzh2 = zzbqb.zzh();
            String zzo2 = zzbqb.zzo();
            List zzr2 = zzbqb.zzr();
            String zzm2 = zzbqb.zzm();
            Bundle zzf2 = zzbqb.zzf();
            String zzn2 = zzbqb.zzn();
            IObjectWrapper zzl2 = zzbqb.zzl();
            String zzq2 = zzbqb.zzq();
            String zzp2 = zzbqb.zzp();
            double zze2 = zzbqb.zze();
            zzbgp zzi2 = zzbqb.zzi();
            zzdit zzdit = new zzdit();
            zzdit.zza = 2;
            zzdit.zzb = zzak;
            zzdit.zzc = zzh2;
            zzdit.zzd = (View) zzam(zzbqb.zzj());
            zzdit.zzZ("headline", zzo2);
            zzdit.zze = zzr2;
            zzdit.zzZ("body", zzm2);
            zzdit.zzh = zzf2;
            zzdit.zzZ("call_to_action", zzn2);
            zzdit.zzo = (View) zzam(zzbqb.zzk());
            zzdit.zzq = zzl2;
            zzdit.zzZ("store", zzq2);
            zzdit.zzZ("price", zzp2);
            zzdit.zzr = zze2;
            zzdit.zzs = zzi2;
            return zzdit;
        } catch (RemoteException e) {
            int i = zze.zza;
            zzo.zzk("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    public static zzdit zzah(zzbqc zzbqc) {
        try {
            zzdis zzak = zzak(zzbqc.zzf(), (zzbqf) null);
            zzbgi zzg2 = zzbqc.zzg();
            String zzo2 = zzbqc.zzo();
            List zzp2 = zzbqc.zzp();
            String zzm2 = zzbqc.zzm();
            Bundle zze2 = zzbqc.zze();
            String zzn2 = zzbqc.zzn();
            IObjectWrapper zzk2 = zzbqc.zzk();
            String zzl2 = zzbqc.zzl();
            zzbgp zzh2 = zzbqc.zzh();
            zzdit zzdit = new zzdit();
            zzdit.zza = 1;
            zzdit.zzb = zzak;
            zzdit.zzc = zzg2;
            zzdit.zzd = (View) zzam(zzbqc.zzi());
            zzdit.zzZ("headline", zzo2);
            zzdit.zze = zzp2;
            zzdit.zzZ("body", zzm2);
            zzdit.zzh = zze2;
            zzdit.zzZ("call_to_action", zzn2);
            zzdit.zzo = (View) zzam(zzbqc.zzj());
            zzdit.zzq = zzk2;
            zzdit.zzZ("advertiser", zzl2);
            zzdit.zzt = zzh2;
            return zzdit;
        } catch (RemoteException e) {
            int i = zze.zza;
            zzo.zzk("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static zzdit zzai(zzbqb zzbqb) {
        try {
            return zzal(zzak(zzbqb.zzg(), (zzbqf) null), zzbqb.zzh(), (View) zzam(zzbqb.zzj()), zzbqb.zzo(), zzbqb.zzr(), zzbqb.zzm(), zzbqb.zzf(), zzbqb.zzn(), (View) zzam(zzbqb.zzk()), zzbqb.zzl(), zzbqb.zzq(), zzbqb.zzp(), zzbqb.zze(), zzbqb.zzi(), (String) null, 0.0f);
        } catch (RemoteException e) {
            int i = zze.zza;
            zzo.zzk("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static zzdit zzaj(zzbqc zzbqc) {
        try {
            return zzal(zzak(zzbqc.zzf(), (zzbqf) null), zzbqc.zzg(), (View) zzam(zzbqc.zzi()), zzbqc.zzo(), zzbqc.zzp(), zzbqc.zzm(), zzbqc.zze(), zzbqc.zzn(), (View) zzam(zzbqc.zzj()), zzbqc.zzk(), (String) null, (String) null, -1.0d, zzbqc.zzh(), zzbqc.zzl(), 0.0f);
        } catch (RemoteException e) {
            int i = zze.zza;
            zzo.zzk("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    private static zzdis zzak(zzed zzed, zzbqf zzbqf) {
        if (zzed == null) {
            return null;
        }
        return new zzdis(zzed, zzbqf);
    }

    private static zzdit zzal(zzed zzed, zzbgi zzbgi, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzbgp zzbgp, String str6, float f) {
        zzdit zzdit = new zzdit();
        zzdit.zza = 6;
        zzdit.zzb = zzed;
        zzdit.zzc = zzbgi;
        zzdit.zzd = view;
        String str7 = str;
        zzdit.zzZ("headline", str);
        zzdit.zze = list;
        String str8 = str2;
        zzdit.zzZ("body", str2);
        zzdit.zzh = bundle;
        String str9 = str3;
        zzdit.zzZ("call_to_action", str3);
        zzdit.zzo = view2;
        zzdit.zzq = iObjectWrapper;
        String str10 = str4;
        zzdit.zzZ("store", str4);
        String str11 = str5;
        zzdit.zzZ("price", str5);
        zzdit.zzr = d;
        zzdit.zzs = zzbgp;
        zzdit.zzZ("advertiser", str6);
        zzdit.zzR(f);
        return zzdit;
    }

    private static Object zzam(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    public static zzdit zzt(zzbqf zzbqf) {
        try {
            return zzal(zzak(zzbqf.zzj(), zzbqf), zzbqf.zzk(), (View) zzam(zzbqf.zzm()), zzbqf.zzs(), zzbqf.zzv(), zzbqf.zzq(), zzbqf.zzi(), zzbqf.zzr(), (View) zzam(zzbqf.zzn()), zzbqf.zzo(), zzbqf.zzu(), zzbqf.zzt(), zzbqf.zze(), zzbqf.zzl(), zzbqf.zzp(), zzbqf.zzf());
        } catch (RemoteException e) {
            int i = zze.zza;
            zzo.zzk("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public final synchronized String zzA() {
        return this.zzu;
    }

    public final synchronized String zzB() {
        return zzF("headline");
    }

    public final synchronized String zzC() {
        return this.zzy;
    }

    public final synchronized String zzD() {
        return zzF("price");
    }

    public final synchronized String zzE() {
        return zzF("store");
    }

    public final synchronized String zzF(String str) {
        return (String) this.zzw.get(str);
    }

    public final synchronized List zzG() {
        return this.zze;
    }

    public final synchronized List zzH() {
        return this.zzf;
    }

    public final synchronized void zzI() {
        zzcfg zzcfg = this.zzi;
        if (zzcfg != null) {
            zzcfg.destroy();
            this.zzi = null;
        }
        zzcfg zzcfg2 = this.zzj;
        if (zzcfg2 != null) {
            zzcfg2.destroy();
            this.zzj = null;
        }
        zzcfg zzcfg3 = this.zzk;
        if (zzcfg3 != null) {
            zzcfg3.destroy();
            this.zzk = null;
        }
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.zzm = null;
        }
        zzcak zzcak = this.zzn;
        if (zzcak != null) {
            zzcak.cancel(false);
            this.zzn = null;
        }
        this.zzl = null;
        this.zzv.clear();
        this.zzw.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
    }

    public final synchronized void zzJ(zzbgi zzbgi) {
        this.zzc = zzbgi;
    }

    public final synchronized void zzK(String str) {
        this.zzu = str;
    }

    public final synchronized void zzL(zzfa zzfa) {
        this.zzg = zzfa;
    }

    public final synchronized void zzM(zzbgp zzbgp) {
        this.zzs = zzbgp;
    }

    public final synchronized void zzN(String str, zzbgc zzbgc) {
        if (zzbgc == null) {
            this.zzv.remove(str);
        } else {
            this.zzv.put(str, zzbgc);
        }
    }

    public final synchronized void zzO(zzcfg zzcfg) {
        this.zzj = zzcfg;
    }

    public final synchronized void zzP(List list) {
        this.zze = list;
    }

    public final synchronized void zzQ(zzbgp zzbgp) {
        this.zzt = zzbgp;
    }

    public final synchronized void zzR(float f) {
        this.zzx = f;
    }

    public final synchronized void zzS(List list) {
        this.zzf = list;
    }

    public final synchronized void zzT(zzcfg zzcfg) {
        this.zzk = zzcfg;
    }

    public final synchronized void zzU(ListenableFuture listenableFuture) {
        this.zzm = listenableFuture;
    }

    public final synchronized void zzV(String str) {
        this.zzy = str;
    }

    public final synchronized void zzW(zzedh zzedh) {
        this.zzl = zzedh;
    }

    public final synchronized void zzX(zzcak zzcak) {
        this.zzn = zzcak;
    }

    public final synchronized void zzY(double d) {
        this.zzr = d;
    }

    public final synchronized void zzZ(String str, String str2) {
        if (str2 == null) {
            this.zzw.remove(str);
        } else {
            this.zzw.put(str, str2);
        }
    }

    public final synchronized double zza() {
        return this.zzr;
    }

    public final synchronized void zzaa(int i) {
        this.zza = i;
    }

    public final synchronized void zzab(zzed zzed) {
        this.zzb = zzed;
    }

    public final synchronized void zzac(View view) {
        this.zzo = view;
    }

    public final synchronized void zzad(zzcfg zzcfg) {
        this.zzi = zzcfg;
    }

    public final synchronized void zzae(View view) {
        this.zzp = view;
    }

    public final synchronized boolean zzaf() {
        return this.zzj != null;
    }

    public final synchronized float zzb() {
        return this.zzx;
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized Bundle zzd() {
        if (this.zzh == null) {
            this.zzh = new Bundle();
        }
        return this.zzh;
    }

    public final synchronized View zze() {
        return this.zzd;
    }

    public final synchronized View zzf() {
        return this.zzo;
    }

    public final synchronized View zzg() {
        return this.zzp;
    }

    public final synchronized SimpleArrayMap zzh() {
        return this.zzv;
    }

    public final synchronized SimpleArrayMap zzi() {
        return this.zzw;
    }

    public final synchronized zzed zzj() {
        return this.zzb;
    }

    public final synchronized zzfa zzk() {
        return this.zzg;
    }

    public final synchronized zzbgi zzl() {
        return this.zzc;
    }

    public final zzbgp zzm() {
        List list = this.zze;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.zze.get(0);
        if (obj instanceof IBinder) {
            return zzbgo.zzh((IBinder) obj);
        }
        return null;
    }

    public final synchronized zzbgp zzn() {
        return this.zzs;
    }

    public final synchronized zzbgp zzo() {
        return this.zzt;
    }

    public final synchronized zzcak zzp() {
        return this.zzn;
    }

    public final synchronized zzcfg zzq() {
        return this.zzj;
    }

    public final synchronized zzcfg zzr() {
        return this.zzk;
    }

    public final synchronized zzcfg zzs() {
        return this.zzi;
    }

    public final synchronized zzedh zzu() {
        return this.zzl;
    }

    public final synchronized IObjectWrapper zzv() {
        return this.zzq;
    }

    public final synchronized ListenableFuture zzw() {
        return this.zzm;
    }

    public final synchronized String zzx() {
        return zzF("advertiser");
    }

    public final synchronized String zzy() {
        return zzF("body");
    }

    public final synchronized String zzz() {
        return zzF("call_to_action");
    }
}
