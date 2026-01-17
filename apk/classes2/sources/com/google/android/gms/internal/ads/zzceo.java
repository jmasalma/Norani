package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzceo extends zzcbs implements zzhj, zzmr {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzcdz zzc;
    private final zzyu zzd;
    private final zzcca zze;
    private final WeakReference zzf;
    private final zzwo zzg;
    private zziy zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcbr zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private final Object zzq = new Object();
    private Integer zzr;
    private final ArrayList zzs;
    private volatile zzceb zzt;
    private final Set zzu = new HashSet();

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00e3, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbde.zzcc)).booleanValue() == false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00e7, code lost:
        if (r5.zzi == false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e9, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ec, code lost:
        if (r5.zzl == false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ee, code lost:
        r6 = new com.google.android.gms.internal.ads.zzcef(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f6, code lost:
        if (r5.zzh <= 0) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f8, code lost:
        r6 = new com.google.android.gms.internal.ads.zzceg(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00fe, code lost:
        r6 = new com.google.android.gms.internal.ads.zzceh(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0105, code lost:
        if (r5.zzi == false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0107, code lost:
        r5 = new com.google.android.gms.internal.ads.zzcei(r3, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x010e, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010f, code lost:
        r4 = r3.zzi;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0111, code lost:
        if (r4 == null) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0117, code lost:
        if (r4.limit() <= 0) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0119, code lost:
        r4 = new byte[r3.zzi.limit()];
        r3.zzi.get(r4);
        r5 = new com.google.android.gms.internal.ads.zzcej(r5, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzceo(android.content.Context r4, com.google.android.gms.internal.ads.zzcca r5, com.google.android.gms.internal.ads.zzccb r6, java.lang.Integer r7) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.zzq = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r3.zzu = r0
            r3.zzb = r4
            r3.zze = r5
            r3.zzr = r7
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
            r7.<init>(r6)
            r3.zzf = r7
            com.google.android.gms.internal.ads.zzcdz r7 = new com.google.android.gms.internal.ads.zzcdz
            r7.<init>()
            r3.zzc = r7
            com.google.android.gms.internal.ads.zzyu r0 = new com.google.android.gms.internal.ads.zzyu
            r0.<init>(r4)
            r3.zzd = r0
            boolean r1 = com.google.android.gms.ads.internal.util.zze.zzc()
            if (r1 == 0) goto L_0x003f
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "SimpleExoPlayerAdapter initialize "
            java.lang.String r1 = r2.concat(r1)
            com.google.android.gms.ads.internal.util.zze.zza(r1)
        L_0x003f:
            java.util.concurrent.atomic.AtomicInteger r1 = zzD()
            r1.incrementAndGet()
            com.google.android.gms.internal.ads.zzmj r1 = new com.google.android.gms.internal.ads.zzmj
            com.google.android.gms.internal.ads.zzcem r2 = new com.google.android.gms.internal.ads.zzcem
            r2.<init>(r3)
            r1.<init>(r4, r2)
            r1.zzb(r0)
            r1.zza(r7)
            com.google.android.gms.internal.ads.zzmk r7 = r1.zzc()
            r3.zzh = r7
            r7.zzz(r3)
            r7 = 0
            r3.zzl = r7
            r0 = 0
            r3.zzn = r0
            r3.zzm = r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.zzs = r0
            r0 = 0
            r3.zzt = r0
            if (r6 == 0) goto L_0x0078
            java.lang.String r0 = r6.zzr()
        L_0x0078:
            com.google.android.gms.internal.ads.zzfvn r0 = com.google.android.gms.internal.ads.zzfvn.zzd(r0)
            java.lang.String r1 = ""
            java.lang.Object r0 = r0.zzb(r1)
            java.lang.String r0 = (java.lang.String) r0
            r3.zzo = r0
            if (r6 == 0) goto L_0x008d
            int r0 = r6.zzf()
            goto L_0x008e
        L_0x008d:
            r0 = r7
        L_0x008e:
            r3.zzp = r0
            com.google.android.gms.internal.ads.zzwo r0 = new com.google.android.gms.internal.ads.zzwo
            com.google.android.gms.ads.internal.util.zzs r1 = com.google.android.gms.ads.internal.zzv.zzr()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r6 = r6.zzm()
            java.lang.String r6 = r6.afmaVersion
            java.lang.String r4 = r1.zzc(r4, r6)
            boolean r6 = r3.zzj
            if (r6 == 0) goto L_0x00c0
            java.nio.ByteBuffer r6 = r3.zzi
            int r6 = r6.limit()
            if (r6 <= 0) goto L_0x00c0
            java.nio.ByteBuffer r4 = r3.zzi
            int r4 = r4.limit()
            byte[] r4 = new byte[r4]
            java.nio.ByteBuffer r5 = r3.zzi
            r5.get(r4)
            com.google.android.gms.internal.ads.zzced r5 = new com.google.android.gms.internal.ads.zzced
            r5.<init>(r4)
            goto L_0x012c
        L_0x00c0:
            com.google.android.gms.internal.ads.zzbcv r6 = com.google.android.gms.internal.ads.zzbde.zzck
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r6 = r1.zzb(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r1 = 1
            if (r6 == 0) goto L_0x00e5
            com.google.android.gms.internal.ads.zzbcv r6 = com.google.android.gms.internal.ads.zzbde.zzcc
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r6 = r2.zzb(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x00e9
        L_0x00e5:
            boolean r6 = r5.zzi
            if (r6 != 0) goto L_0x00ea
        L_0x00e9:
            r7 = r1
        L_0x00ea:
            boolean r6 = r5.zzl
            if (r6 == 0) goto L_0x00f4
            com.google.android.gms.internal.ads.zzcef r6 = new com.google.android.gms.internal.ads.zzcef
            r6.<init>(r3, r4, r7)
            goto L_0x0103
        L_0x00f4:
            int r6 = r5.zzh
            if (r6 <= 0) goto L_0x00fe
            com.google.android.gms.internal.ads.zzceg r6 = new com.google.android.gms.internal.ads.zzceg
            r6.<init>(r3, r4, r7)
            goto L_0x0103
        L_0x00fe:
            com.google.android.gms.internal.ads.zzceh r6 = new com.google.android.gms.internal.ads.zzceh
            r6.<init>(r3, r4, r7)
        L_0x0103:
            boolean r4 = r5.zzi
            if (r4 == 0) goto L_0x010e
            com.google.android.gms.internal.ads.zzcei r4 = new com.google.android.gms.internal.ads.zzcei
            r4.<init>(r3, r6)
            r5 = r4
            goto L_0x010f
        L_0x010e:
            r5 = r6
        L_0x010f:
            java.nio.ByteBuffer r4 = r3.zzi
            if (r4 == 0) goto L_0x012c
            int r4 = r4.limit()
            if (r4 <= 0) goto L_0x012c
            java.nio.ByteBuffer r4 = r3.zzi
            int r4 = r4.limit()
            byte[] r4 = new byte[r4]
            java.nio.ByteBuffer r6 = r3.zzi
            r6.get(r4)
            com.google.android.gms.internal.ads.zzcej r6 = new com.google.android.gms.internal.ads.zzcej
            r6.<init>(r5, r4)
            r5 = r6
        L_0x012c:
            com.google.android.gms.internal.ads.zzbcv r4 = com.google.android.gms.internal.ads.zzbde.zzn
            com.google.android.gms.internal.ads.zzbdc r6 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r6.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0144
            com.google.android.gms.internal.ads.zzcen r4 = new com.google.android.gms.internal.ads.zzcen
            r4.<init>()
            goto L_0x0149
        L_0x0144:
            com.google.android.gms.internal.ads.zzcee r4 = new com.google.android.gms.internal.ads.zzcee
            r4.<init>()
        L_0x0149:
            com.google.android.gms.internal.ads.zzwn r6 = new com.google.android.gms.internal.ads.zzwn
            r6.<init>(r4)
            r0.<init>(r5, r6)
            r3.zzg = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzceo.<init>(android.content.Context, com.google.android.gms.internal.ads.zzcca, com.google.android.gms.internal.ads.zzccb, java.lang.Integer):void");
    }

    public static /* synthetic */ zzgj zzW(zzceo zzceo, String str, boolean z) {
        zzceo zzceo2 = true != z ? null : zzceo;
        zzcca zzcca = zzceo.zze;
        return new zzcer(str, zzceo2, zzcca.zzd, zzcca.zze, zzcca.zzm, zzcca.zzn);
    }

    public static /* synthetic */ zzgj zzX(zzceo zzceo, String str, boolean z) {
        zzceo zzceo2 = true != z ? null : zzceo;
        zzcca zzcca = zzceo.zze;
        zzcdy zzcdy = new zzcdy(str, zzceo2, zzcca.zzd, zzcca.zze, zzcca.zzh);
        zzceo.zzu.add(new WeakReference(zzcdy));
        return zzcdy;
    }

    public static /* synthetic */ zzgj zzY(zzceo zzceo, String str, boolean z) {
        zzgr zzgr = new zzgr();
        zzgr.zzf(str);
        zzgr.zze(true != z ? null : zzceo);
        zzcca zzcca = zzceo.zze;
        zzgr.zzc(zzcca.zzd);
        zzgr.zzd(zzcca.zze);
        zzgr.zzb(true);
        return zzgr.zza();
    }

    public static /* synthetic */ zzgj zzZ(zzceo zzceo, zzgi zzgi) {
        zzgj zza2 = zzgi.zza();
        zzcel zzcel = new zzcel(zzceo);
        return new zzceb(zzceo.zzb, zza2, zzceo.zzo, zzceo.zzp, zzceo, zzcel);
    }

    public static /* synthetic */ void zzab(zzceo zzceo, boolean z, long j) {
        zzcbr zzcbr = zzceo.zzk;
        if (zzcbr != null) {
            zzcbr.zzi(z, j);
        }
    }

    public static /* synthetic */ zzma[] zzac(zzceo zzceo, Handler handler, zzacj zzacj, zzqh zzqh, zzxn zzxn, zzuf zzuf) {
        zztr zztr = zztr.zza;
        Context context = zzceo.zzb;
        Context context2 = context;
        zzru zzru = new zzru(context2, new zzsx(context, (zzfwh) null, (zzfwh) null), zztr, false, handler, zzqh, new zzrc(context).zzc());
        zzaay zzaay = new zzaay(context);
        zzaay.zzg(zztr);
        zzaay.zze(handler);
        zzaay.zzf(zzacj);
        return new zzma[]{zzru, zzaay.zzh()};
    }

    private final boolean zzad() {
        return this.zzt != null && this.zzt.zzq();
    }

    public final void finalize() {
        zzD().decrementAndGet();
        if (zze.zzc()) {
            zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    public final long zzA() {
        if (!zzad()) {
            return (long) this.zzl;
        }
        return 0;
    }

    public final long zzB() {
        if (zzad()) {
            return this.zzt.zzl();
        }
        synchronized (this.zzq) {
            while (true) {
                ArrayList arrayList = this.zzs;
                if (!arrayList.isEmpty()) {
                    long j = this.zzn;
                    Map zze2 = ((zzhe) arrayList.remove(0)).zze();
                    long j2 = 0;
                    if (zze2 != null) {
                        Iterator it = zze2.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (!(entry.getKey() == null || !zzfuv.zzc("content-length", (CharSequence) entry.getKey()) || entry.getValue() == null || ((List) entry.getValue()).get(0) == null)) {
                                        j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.zzn = j + j2;
                }
            }
        }
        return this.zzn;
    }

    public final Integer zzC() {
        return this.zzr;
    }

    public final void zzF(Uri[] uriArr, String str) {
        zzG(uriArr, str, ByteBuffer.allocate(0), false);
    }

    public final void zzH() {
        zziy zziy = this.zzh;
        if (zziy != null) {
            zziy.zzB(this);
            this.zzh.zzA();
            this.zzh = null;
            zzE().decrementAndGet();
        }
    }

    public final void zzI(long j) {
        this.zzh.zza(j);
    }

    public final void zzJ(int i) {
        this.zzc.zzl(i);
    }

    public final void zzK(int i) {
        this.zzc.zzm(i);
    }

    public final void zzL(zzcbr zzcbr) {
        this.zzk = zzcbr;
    }

    public final void zzM(int i) {
        this.zzc.zzn(i);
    }

    public final void zzN(int i) {
        this.zzc.zzo(i);
    }

    public final void zzO(boolean z) {
        this.zzh.zzr(z);
    }

    public final void zzP(Integer num) {
        this.zzr = num;
    }

    public final void zzQ(boolean z) {
        if (this.zzh != null) {
            int i = 0;
            while (true) {
                this.zzh.zzy();
                if (i < 2) {
                    zzyu zzyu = this.zzd;
                    zzyh zzc2 = zzyu.zzf().zzc();
                    zzc2.zzx(i, !z);
                    zzyu.zzl(zzc2);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void zzR(int i) {
        for (WeakReference weakReference : this.zzu) {
            zzcdy zzcdy = (zzcdy) weakReference.get();
            if (zzcdy != null) {
                zzcdy.zzm(i);
            }
        }
    }

    public final void zzS(Surface surface, boolean z) {
        zziy zziy = this.zzh;
        if (zziy != null) {
            zziy.zzs(surface);
        }
    }

    public final void zzT(float f, boolean z) {
        zziy zziy = this.zzh;
        if (zziy != null) {
            zziy.zzt(f);
        }
    }

    public final void zzU() {
        this.zzh.zzu();
    }

    public final boolean zzV() {
        return this.zzh != null;
    }

    public final void zza(zzgj zzgj, zzgo zzgo, boolean z, int i) {
        this.zzl += i;
    }

    /* access modifiers changed from: package-private */
    public final zzvj zzaa(Uri uri) {
        zzad zzad = new zzad();
        zzad.zzb(uri);
        zzap zzc2 = zzad.zzc();
        zzwo zzwo = this.zzg;
        zzwo.zza(this.zze.zzf);
        return zzwo.zzb(zzc2);
    }

    public final void zzb(zzgj zzgj, zzgo zzgo, boolean z) {
    }

    public final void zzc(zzgj zzgj, zzgo zzgo, boolean z) {
    }

    public final void zzd(zzgj zzgj, zzgo zzgo, boolean z) {
        if (zzgj instanceof zzhe) {
            synchronized (this.zzq) {
                this.zzs.add((zzhe) zzgj);
            }
        } else if (zzgj instanceof zzceb) {
            this.zzt = (zzceb) zzgj;
            zzccb zzccb = (zzccb) this.zzf.get();
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzcc)).booleanValue() && zzccb != null && this.zzt.zzn()) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzt.zzp()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzt.zzo()));
                zzs.zza.post(new zzcek(zzccb, hashMap));
            }
        }
    }

    public final void zze(zzmp zzmp, zzz zzz, zzie zzie) {
        zzccb zzccb = (zzccb) this.zzf.get();
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcc)).booleanValue() && zzccb != null) {
            HashMap hashMap = new HashMap();
            String str = zzz.zzn;
            if (str != null) {
                hashMap.put("audioMime", str);
            }
            String str2 = zzz.zzo;
            if (str2 != null) {
                hashMap.put("audioSampleMime", str2);
            }
            String str3 = zzz.zzk;
            if (str3 != null) {
                hashMap.put("audioCodec", str3);
            }
            zzccb.zzd("onMetadataEvent", hashMap);
        }
    }

    public final /* synthetic */ void zzf(zzmp zzmp, int i, long j, long j2) {
    }

    public final /* synthetic */ void zzg(zzmp zzmp, zzvd zzvd) {
    }

    public final void zzh(zzmp zzmp, int i, long j) {
        this.zzm += i;
    }

    public final /* synthetic */ void zzi(zzbh zzbh, zzmq zzmq) {
    }

    public final void zzj(zzmp zzmp, zzuy zzuy, zzvd zzvd, IOException iOException, boolean z) {
        zzcbr zzcbr = this.zzk;
        if (zzcbr == null) {
            return;
        }
        if (this.zze.zzj) {
            zzcbr.zzl("onLoadException", iOException);
        } else {
            zzcbr.zzk("onLoadError", iOException);
        }
    }

    public final void zzk(zzmp zzmp, int i) {
        zzcbr zzcbr = this.zzk;
        if (zzcbr != null) {
            zzcbr.zzm(i);
        }
    }

    public final void zzl(zzmp zzmp, zzba zzba) {
        zzcbr zzcbr = this.zzk;
        if (zzcbr != null) {
            zzcbr.zzk("onPlayerError", zzba);
        }
    }

    public final /* synthetic */ void zzm(zzmp zzmp, zzbf zzbf, zzbf zzbf2, int i) {
    }

    public final void zzn(zzmp zzmp, Object obj, long j) {
        zzcbr zzcbr = this.zzk;
        if (zzcbr != null) {
            zzcbr.zzv();
        }
    }

    public final /* synthetic */ void zzo(zzmp zzmp, zzid zzid) {
    }

    public final void zzp(zzmp zzmp, zzz zzz, zzie zzie) {
        zzccb zzccb = (zzccb) this.zzf.get();
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcc)).booleanValue() && zzccb != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("frameRate", String.valueOf(zzz.zzz));
            hashMap.put("bitRate", String.valueOf(zzz.zzj));
            int i = zzz.zzv;
            int i2 = zzz.zzw;
            hashMap.put("resolution", i + "x" + i2);
            String str = zzz.zzn;
            if (str != null) {
                hashMap.put("videoMime", str);
            }
            String str2 = zzz.zzo;
            if (str2 != null) {
                hashMap.put("videoSampleMime", str2);
            }
            String str3 = zzz.zzk;
            if (str3 != null) {
                hashMap.put("videoCodec", str3);
            }
            zzccb.zzd("onMetadataEvent", hashMap);
        }
    }

    public final void zzq(zzmp zzmp, zzcd zzcd) {
        zzcbr zzcbr = this.zzk;
        if (zzcbr != null) {
            zzcbr.zzD(zzcd.zzb, zzcd.zzc);
        }
    }

    public final int zzr() {
        return this.zzm;
    }

    public final int zzt() {
        return this.zzh.zzg();
    }

    public final long zzv() {
        return this.zzh.zzj();
    }

    public final long zzw() {
        return (long) this.zzl;
    }

    public final long zzx() {
        if (zzad() && this.zzt.zzp()) {
            return Math.min((long) this.zzl, this.zzt.zzk());
        }
        return 0;
    }

    public final long zzy() {
        return this.zzh.zzl();
    }

    public final long zzz() {
        return this.zzh.zzm();
    }

    public final void zzG(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzvj zzvj;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z;
            int length = uriArr.length;
            if (length == 1) {
                zzvj = zzaa(uriArr[0]);
            } else {
                zzvj[] zzvjArr = new zzvj[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzvjArr[i] = zzaa(uriArr[i]);
                }
                zzvj = new zzvz(false, false, new zzus(), zzvjArr);
            }
            this.zzh.zzC(zzvj);
            this.zzh.zzq();
            zzE().incrementAndGet();
        }
    }
}
