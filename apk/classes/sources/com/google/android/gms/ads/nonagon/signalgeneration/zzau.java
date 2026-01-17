package com.google.android.gms.ads.nonagon.signalgeneration;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzavu;
import com.google.android.gms.internal.ads.zzavv;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbej;
import com.google.android.gms.internal.ads.zzbex;
import com.google.android.gms.internal.ads.zzbfj;
import com.google.android.gms.internal.ads.zzbuf;
import com.google.android.gms.internal.ads.zzbui;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzche;
import com.google.android.gms.internal.ads.zzdny;
import com.google.android.gms.internal.ads.zzdso;
import com.google.android.gms.internal.ads.zzfda;
import com.google.android.gms.internal.ads.zzfdv;
import com.google.android.gms.internal.ads.zzfhu;
import com.google.android.gms.internal.ads.zzfhx;
import com.google.android.gms.internal.ads.zzfjy;
import com.google.android.gms.internal.ads.zzfwg;
import com.google.android.gms.internal.ads.zzgde;
import com.google.android.gms.internal.ads.zzgdn;
import com.google.android.gms.internal.ads.zzgdy;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzau extends zzbyz {
    protected static final List zza = new ArrayList(Arrays.asList(new String[]{"/aclk", "/pcs/click", "/dbm/clk"}));
    protected static final List zzb = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com"}));
    protected static final List zzc = new ArrayList(Arrays.asList(new String[]{"/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"}));
    protected static final List zzd = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"}));
    public static final /* synthetic */ int zze = 0;
    /* access modifiers changed from: private */
    public final String zzA;
    private final List zzB;
    private final List zzC;
    private final List zzD;
    private final List zzE;
    private final AtomicBoolean zzF = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public final AtomicBoolean zzG = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public final AtomicInteger zzH = new AtomicInteger(0);
    private final zzbej zzI;
    private final zzo zzJ;
    private final zzf zzK;
    private final zzche zzf;
    /* access modifiers changed from: private */
    public Context zzg;
    private final zzavu zzh;
    private final zzfda zzi;
    private final zzfdv zzj;
    private final zzgdy zzk;
    private final ScheduledExecutorService zzl;
    private zzbui zzm;
    private Point zzn = new Point();
    private Point zzo = new Point();
    /* access modifiers changed from: private */
    public final zzdso zzp;
    /* access modifiers changed from: private */
    public final zzfjy zzq;
    /* access modifiers changed from: private */
    public final boolean zzr;
    /* access modifiers changed from: private */
    public final boolean zzs;
    /* access modifiers changed from: private */
    public final boolean zzt;
    /* access modifiers changed from: private */
    public final boolean zzu;
    /* access modifiers changed from: private */
    public final String zzv;
    /* access modifiers changed from: private */
    public final String zzw;
    /* access modifiers changed from: private */
    public final AtomicInteger zzx = new AtomicInteger(0);
    /* access modifiers changed from: private */
    public final VersionInfoParcel zzy;
    /* access modifiers changed from: private */
    public String zzz;

    zzau(zzche zzche, Context context, zzavu zzavu, zzfdv zzfdv, zzgdy zzgdy, ScheduledExecutorService scheduledExecutorService, zzdso zzdso, zzfjy zzfjy, VersionInfoParcel versionInfoParcel, zzbej zzbej, zzfda zzfda, zzo zzo2, zzf zzf2) {
        List list;
        this.zzf = zzche;
        this.zzg = context;
        this.zzh = zzavu;
        this.zzi = zzfda;
        this.zzj = zzfdv;
        this.zzk = zzgdy;
        this.zzl = scheduledExecutorService;
        this.zzp = zzdso;
        this.zzq = zzfjy;
        this.zzy = versionInfoParcel;
        this.zzI = zzbej;
        this.zzr = ((Boolean) zzbd.zzc().zzb(zzbde.zzhx)).booleanValue();
        this.zzs = ((Boolean) zzbd.zzc().zzb(zzbde.zzhw)).booleanValue();
        this.zzt = ((Boolean) zzbd.zzc().zzb(zzbde.zzhz)).booleanValue();
        this.zzu = ((Boolean) zzbd.zzc().zzb(zzbde.zzhB)).booleanValue();
        this.zzv = (String) zzbd.zzc().zzb(zzbde.zzhA);
        this.zzw = (String) zzbd.zzc().zzb(zzbde.zzhC);
        this.zzA = (String) zzbd.zzc().zzb(zzbde.zzhD);
        this.zzJ = zzo2;
        this.zzK = zzf2;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzhE)).booleanValue()) {
            this.zzB = zzZ((String) zzbd.zzc().zzb(zzbde.zzhF));
            this.zzC = zzZ((String) zzbd.zzc().zzb(zzbde.zzhG));
            this.zzD = zzZ((String) zzbd.zzc().zzb(zzbde.zzhH));
            list = zzZ((String) zzbd.zzc().zzb(zzbde.zzhI));
        } else {
            this.zzB = zza;
            this.zzC = zzb;
            this.zzD = zzc;
            list = zzd;
        }
        this.zzE = list;
    }

    public static /* synthetic */ ArrayList zzC(zzau zzau, List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzau.zzQ(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zzaa(uri, "nas", str));
            }
        }
        return arrayList;
    }

    public static /* synthetic */ ArrayList zzD(zzau zzau, List list, IObjectWrapper iObjectWrapper) {
        zzavu zzavu = zzau.zzh;
        String zzh2 = zzavu.zzc() != null ? zzavu.zzc().zzh(zzau.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), (Activity) null) : "";
        if (!TextUtils.isEmpty(zzh2)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (!zzau.zzQ(uri)) {
                    String valueOf = String.valueOf(String.valueOf(uri));
                    int i = zze.zza;
                    zzo.zzj("Not a Google URL: ".concat(valueOf));
                    arrayList.add(uri);
                } else {
                    arrayList.add(zzaa(uri, "ms", zzh2));
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            throw new Exception("Empty impression URLs result.");
        }
        throw new Exception("Failed to get view signals.");
    }

    public static /* synthetic */ void zzH(zzau zzau, zzdny[] zzdnyArr) {
        zzdny zzdny = zzdnyArr[0];
        if (zzdny != null) {
            zzau.zzj.zzb(zzgdn.zzh(zzdny));
        }
    }

    static /* bridge */ /* synthetic */ void zzJ(zzau zzau, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzau.zzP((Uri) it.next())) {
                zzau.zzx.getAndIncrement();
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzac zzR(android.content.Context r14, java.lang.String r15, java.lang.String r16, com.google.android.gms.ads.internal.client.zzr r17, com.google.android.gms.ads.internal.client.zzm r18, int r19, java.lang.String r20, android.os.Bundle r21, com.google.android.gms.internal.ads.zzbze r22) {
        /*
            r13 = this;
            r0 = r14
            r1 = r16
            com.google.android.gms.internal.ads.zzfcu r2 = new com.google.android.gms.internal.ads.zzfcu
            r2.<init>()
            java.lang.String r3 = "REWARDED"
            boolean r4 = r3.equals(r1)
            java.lang.String r5 = "REWARDED_INTERSTITIAL"
            r6 = 3
            r7 = 2
            if (r4 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.zzfch r4 = r2.zzq()
            r4.zza(r7)
            goto L_0x0029
        L_0x001c:
            boolean r4 = r5.equals(r1)
            if (r4 == 0) goto L_0x0029
            com.google.android.gms.internal.ads.zzfch r4 = r2.zzq()
            r4.zza(r6)
        L_0x0029:
            r4 = r13
            com.google.android.gms.internal.ads.zzche r8 = r4.zzf
            com.google.android.gms.ads.nonagon.signalgeneration.zzab r8 = r8.zzo()
            com.google.android.gms.internal.ads.zzcvf r9 = new com.google.android.gms.internal.ads.zzcvf
            r9.<init>()
            r9.zzf(r14)
            if (r15 != 0) goto L_0x003d
            java.lang.String r10 = "adUnitId"
            goto L_0x003e
        L_0x003d:
            r10 = r15
        L_0x003e:
            r2.zzu(r10)
            if (r18 != 0) goto L_0x004d
            com.google.android.gms.ads.internal.client.zzn r10 = new com.google.android.gms.ads.internal.client.zzn
            r10.<init>()
            com.google.android.gms.ads.internal.client.zzm r10 = r10.zza()
            goto L_0x004f
        L_0x004d:
            r10 = r18
        L_0x004f:
            r2.zzJ(r10)
            r10 = 1
            if (r17 != 0) goto L_0x00b5
            int r11 = r16.hashCode()
            r12 = 4
            switch(r11) {
                case -1999289321: goto L_0x0082;
                case -428325382: goto L_0x0078;
                case 543046670: goto L_0x0070;
                case 1854800829: goto L_0x0068;
                case 1951953708: goto L_0x005e;
                default: goto L_0x005d;
            }
        L_0x005d:
            goto L_0x008c
        L_0x005e:
            java.lang.String r3 = "BANNER"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x008c
            r3 = 0
            goto L_0x008d
        L_0x0068:
            boolean r3 = r1.equals(r5)
            if (r3 == 0) goto L_0x008c
            r3 = r7
            goto L_0x008d
        L_0x0070:
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x008c
            r3 = r10
            goto L_0x008d
        L_0x0078:
            java.lang.String r3 = "APP_OPEN_AD"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x008c
            r3 = r12
            goto L_0x008d
        L_0x0082:
            java.lang.String r3 = "NATIVE"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x008c
            r3 = r6
            goto L_0x008d
        L_0x008c:
            r3 = -1
        L_0x008d:
            if (r3 == 0) goto L_0x00ac
            if (r3 == r10) goto L_0x00a7
            if (r3 == r7) goto L_0x00a7
            if (r3 == r6) goto L_0x00a2
            if (r3 == r12) goto L_0x009d
            com.google.android.gms.ads.internal.client.zzr r0 = new com.google.android.gms.ads.internal.client.zzr
            r0.<init>()
            goto L_0x00b7
        L_0x009d:
            com.google.android.gms.ads.internal.client.zzr r0 = com.google.android.gms.ads.internal.client.zzr.zzb()
            goto L_0x00b7
        L_0x00a2:
            com.google.android.gms.ads.internal.client.zzr r0 = com.google.android.gms.ads.internal.client.zzr.zzc()
            goto L_0x00b7
        L_0x00a7:
            com.google.android.gms.ads.internal.client.zzr r0 = com.google.android.gms.ads.internal.client.zzr.zzd()
            goto L_0x00b7
        L_0x00ac:
            com.google.android.gms.ads.internal.client.zzr r3 = new com.google.android.gms.ads.internal.client.zzr
            com.google.android.gms.ads.AdSize r5 = com.google.android.gms.ads.AdSize.BANNER
            r3.<init>((android.content.Context) r14, (com.google.android.gms.ads.AdSize) r5)
            r0 = r3
            goto L_0x00b7
        L_0x00b5:
            r0 = r17
        L_0x00b7:
            r2.zzt(r0)
            r2.zzA(r10)
            r0 = r21
            r2.zzB(r0)
            com.google.android.gms.internal.ads.zzfcw r0 = r2.zzL()
            r9.zzk(r0)
            r0 = r19
            r9.zzi(r0)
            com.google.android.gms.internal.ads.zzcvh r0 = r9.zzl()
            r8.zza(r0)
            com.google.android.gms.ads.nonagon.signalgeneration.zzax r0 = new com.google.android.gms.ads.nonagon.signalgeneration.zzax
            r0.<init>()
            r0.zzb(r1)
            r1 = r20
            r0.zzc(r1)
            r1 = r22
            r0.zzd(r1)
            com.google.android.gms.ads.nonagon.signalgeneration.zzaz r1 = new com.google.android.gms.ads.nonagon.signalgeneration.zzaz
            r2 = 0
            r1.<init>(r0, r2)
            r8.zzb(r1)
            com.google.android.gms.internal.ads.zzdbu r0 = new com.google.android.gms.internal.ads.zzdbu
            r0.<init>()
            com.google.android.gms.ads.nonagon.signalgeneration.zzac r0 = r8.zzc()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzau.zzR(android.content.Context, java.lang.String, java.lang.String, com.google.android.gms.ads.internal.client.zzr, com.google.android.gms.ads.internal.client.zzm, int, java.lang.String, android.os.Bundle, com.google.android.gms.internal.ads.zzbze):com.google.android.gms.ads.nonagon.signalgeneration.zzac");
    }

    private final ListenableFuture zzS(String str) {
        zzdny[] zzdnyArr = new zzdny[1];
        ListenableFuture zza2 = this.zzj.zza();
        zzaf zzaf = new zzaf(this, zzdnyArr, str);
        zzgdy zzgdy = this.zzk;
        ListenableFuture zzn2 = zzgdn.zzn(zza2, zzaf, zzgdy);
        zzn2.addListener(new zzag(this, zzdnyArr), zzgdy);
        return zzgdn.zze(zzgdn.zzm(zzgdn.zzo(zzgde.zzw(zzn2), (long) ((Integer) zzbd.zzc().zzb(zzbde.zzhV)).intValue(), TimeUnit.MILLISECONDS, this.zzl), new zzam(), zzgdy), Exception.class, new zzan(), zzgdy);
    }

    /* access modifiers changed from: private */
    public final void zzT() {
        ListenableFuture listenableFuture;
        if (((Boolean) zzbfj.zze.zze()).booleanValue()) {
            this.zzJ.zze();
            return;
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzlz)).booleanValue()) {
            listenableFuture = zzgdn.zzk(new zzad(this), zzcaf.zza);
        } else {
            listenableFuture = zzR(this.zzg, (String) null, AdFormat.BANNER.name(), (zzr) null, (zzm) null, 0, (String) null, new Bundle(), (zzbze) null).zzb();
        }
        zzgdn.zzr(listenableFuture, new zzat(this), this.zzf.zzA());
    }

    private final void zzU() {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzjY)).booleanValue()) {
            if (!((Boolean) zzbd.zzc().zzb(zzbde.zzkb)).booleanValue()) {
                if (!((Boolean) zzbd.zzc().zzb(zzbde.zzkf)).booleanValue() || !this.zzF.getAndSet(true)) {
                    zzT();
                }
            }
        }
    }

    private final void zzV(List list, IObjectWrapper iObjectWrapper, zzbuf zzbuf, boolean z) {
        ListenableFuture listenableFuture;
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzhU)).booleanValue()) {
            int i = zze.zza;
            zzo.zzj("The updating URL feature is not enabled.");
            try {
                zzbuf.zze("The updating URL feature is not enabled.");
            } catch (RemoteException e) {
                zzo.zzh("", e);
            }
        } else {
            Iterator it = list.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (zzP((Uri) it.next())) {
                    i2++;
                }
            }
            if (i2 > 1) {
                String valueOf = String.valueOf(String.valueOf(list));
                int i3 = zze.zza;
                zzo.zzj("Multiple google urls found: ".concat(valueOf));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Uri uri = (Uri) it2.next();
                if (!zzP(uri)) {
                    String valueOf2 = String.valueOf(String.valueOf(uri));
                    int i4 = zze.zza;
                    zzo.zzj("Not a Google URL: ".concat(valueOf2));
                    listenableFuture = zzgdn.zzh(uri);
                } else {
                    zzgdy zzgdy = this.zzk;
                    listenableFuture = zzgdy.zzb(new zzah(this, uri, iObjectWrapper));
                    if (zzY()) {
                        listenableFuture = zzgdn.zzn(listenableFuture, new zzai(this), zzgdy);
                    } else {
                        int i5 = zze.zza;
                        zzo.zzi("Asset view map is empty.");
                    }
                }
                arrayList.add(listenableFuture);
            }
            zzgdn.zzr(zzgdn.zzd(arrayList), new zzas(this, zzbuf, z), this.zzf.zzA());
        }
    }

    private final void zzW(List list, IObjectWrapper iObjectWrapper, zzbuf zzbuf, boolean z) {
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzhU)).booleanValue()) {
            try {
                zzbuf.zze("The updating URL feature is not enabled.");
            } catch (RemoteException e) {
                int i = zze.zza;
                zzo.zzh("", e);
            }
        } else {
            zzgdy zzgdy = this.zzk;
            ListenableFuture zzb2 = zzgdy.zzb(new zzao(this, list, iObjectWrapper));
            if (zzY()) {
                zzb2 = zzgdn.zzn(zzb2, new zzap(this), zzgdy);
            } else {
                int i2 = zze.zza;
                zzo.zzi("Asset view map is empty.");
            }
            zzgdn.zzr(zzb2, new zzar(this, zzbuf, z), this.zzf.zzA());
        }
    }

    private static boolean zzX(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (!(host == null || path == null)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.zzb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzY() {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.zzbui r0 = r1.zzm
            if (r0 == 0) goto L_0x0010
            java.util.Map r0 = r0.zzb
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzau.zzY():boolean");
    }

    private static final List zzZ(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!zzfwg.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final Uri zzaa(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = indexOf + 1;
        return Uri.parse(uri2.substring(0, i) + str + "=" + str2 + "&" + uri2.substring(i));
    }

    public static /* synthetic */ Uri zzd(zzau zzau, Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zzaa(uri, "nas", str) : uri;
    }

    public static /* synthetic */ Uri zzn(zzau zzau, Uri uri, IObjectWrapper iObjectWrapper) {
        zzfda zzfda;
        try {
            if (!((Boolean) zzbd.zzc().zzb(zzbde.zzmu)).booleanValue() || (zzfda = zzau.zzi) == null) {
                uri = zzau.zzh.zza(uri, zzau.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), (Activity) null);
            } else {
                uri = zzfda.zza(uri, zzau.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), (Activity) null);
            }
        } catch (zzavv e) {
            int i = zze.zza;
            zzo.zzk("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    static /* bridge */ /* synthetic */ zzfhu zzs(ListenableFuture listenableFuture, zzbze zzbze) {
        String str;
        if (!zzfhx.zza() || !((Boolean) zzbex.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfhu zza2 = ((zzac) zzgdn.zzp(listenableFuture)).zza();
            zza2.zzd(new ArrayList(Collections.singletonList(zzbze.zzb)));
            zzm zzm2 = zzbze.zzd;
            if (zzm2 == null) {
                str = "";
            } else {
                str = zzm2.zzp;
            }
            zza2.zzb(str);
            zza2.zzf(zzm2.zzm);
            return zza2;
        } catch (ExecutionException e) {
            zzv.zzp().zzw(e, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    public static /* synthetic */ ListenableFuture zzx(zzau zzau, zzdny[] zzdnyArr, String str, zzdny zzdny) {
        zzdnyArr[0] = zzdny;
        Context context = zzau.zzg;
        zzbui zzbui = zzau.zzm;
        Map map = zzbui.zzb;
        JSONObject zzd2 = zzbv.zzd(context, map, map, zzbui.zza, (ImageView.ScaleType) null);
        JSONObject zzh2 = zzbv.zzh(zzau.zzg, zzau.zzm.zza);
        JSONObject zzg2 = zzbv.zzg(zzau.zzm.zza);
        JSONObject zze2 = zzbv.zze(zzau.zzg, zzau.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", zzd2);
        jSONObject.put("ad_view_signal", zzh2);
        jSONObject.put("scroll_view_signal", zzg2);
        jSONObject.put("lock_screen_signal", zze2);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", zzbv.zzc((String) null, zzau.zzg, zzau.zzo, zzau.zzn));
        }
        return zzdny.zzg(str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzP(Uri uri) {
        return zzX(uri, this.zzB, this.zzC);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzQ(Uri uri) {
        return zzX(uri, this.zzD, this.zzE);
    }

    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) {
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzkl)).booleanValue()) {
            return ObjectWrapper.wrap(null);
        }
        zzbej zzbej = this.zzI;
        zzbej.zzg((Context) ObjectWrapper.unwrap(iObjectWrapper), (CustomTabsClient) ObjectWrapper.unwrap(iObjectWrapper2), str, (CustomTabsCallback) ObjectWrapper.unwrap(iObjectWrapper3));
        if (((Boolean) zzbfj.zze.zze()).booleanValue()) {
            this.zzJ.zze();
        }
        if (((Boolean) zzbfj.zzc.zze()).booleanValue()) {
            this.zzK.zzb((WebView) null);
        }
        return ObjectWrapper.wrap(zzbej.zzb());
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzf(com.google.android.gms.dynamic.IObjectWrapper r11, com.google.android.gms.internal.ads.zzbze r12, com.google.android.gms.internal.ads.zzbyx r13) {
        /*
            r10 = this;
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzcq
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0035
            com.google.android.gms.internal.ads.zzdrr r0 = com.google.android.gms.internal.ads.zzdrr.zza
            java.lang.String r0 = r0.zza()
            com.google.android.gms.ads.internal.client.zzm r1 = r12.zzd
            long r1 = r1.zzz
            r8.putLong(r0, r1)
            com.google.android.gms.internal.ads.zzdrr r0 = com.google.android.gms.internal.ads.zzdrr.zzb
            java.lang.String r0 = r0.zza()
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzv.zzD()
            long r1 = r1.currentTimeMillis()
            r8.putLong(r0, r1)
        L_0x0035:
            java.lang.Object r11 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r11)
            android.content.Context r11 = (android.content.Context) r11
            r10.zzg = r11
            r0 = 22
            com.google.android.gms.internal.ads.zzfhj r11 = com.google.android.gms.internal.ads.zzfhi.zza(r11, r0)
            r11.zzi()
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzhN
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x007c
            com.google.android.gms.ads.internal.client.zzm r0 = r12.zzd
            android.os.Bundle r2 = r0.zzc
            java.lang.String r3 = "optimize_for_app_start"
            boolean r2 = r2.getBoolean(r3, r1)
            if (r2 != 0) goto L_0x0066
            goto L_0x007c
        L_0x0066:
            java.lang.String r0 = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(r0)
            java.lang.String r2 = "requester_type_8"
            boolean r0 = java.util.Objects.equals(r0, r2)
            if (r0 != 0) goto L_0x0073
            goto L_0x007c
        L_0x0073:
            int r0 = r12.zze
            r1 = 2
            if (r0 != r1) goto L_0x0079
            goto L_0x007c
        L_0x0079:
            r0 = 1
            r6 = r0
            goto L_0x007d
        L_0x007c:
            r6 = r1
        L_0x007d:
            java.lang.String r3 = r12.zzb
            java.lang.String r0 = "UNKNOWN"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00d5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzhM
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r2.zzb(r1)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x00b2
            com.google.android.gms.internal.ads.zzbdc r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r0.zzb(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            java.util.List r0 = java.util.Arrays.asList(r0)
        L_0x00b2:
            com.google.android.gms.ads.internal.client.zzm r1 = r12.zzd
            java.lang.String r1 = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(r1)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00d5
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown format is no longer supported."
            r0.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgdn.zzg(r0)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgdn.zzg(r2)
            r3 = r0
            r0 = r1
            goto L_0x0115
        L_0x00d5:
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzlz
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00fc
            com.google.android.gms.internal.ads.zzgdy r0 = com.google.android.gms.internal.ads.zzcaf.zza
            com.google.android.gms.ads.nonagon.signalgeneration.zzak r1 = new com.google.android.gms.ads.nonagon.signalgeneration.zzak
            r1.<init>(r10, r12, r6, r8)
            com.google.common.util.concurrent.ListenableFuture r1 = r0.zzb(r1)
            com.google.android.gms.ads.nonagon.signalgeneration.zzal r2 = new com.google.android.gms.ads.nonagon.signalgeneration.zzal
            r2.<init>()
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgdn.zzn(r1, r2, r0)
            goto L_0x0114
        L_0x00fc:
            android.content.Context r1 = r10.zzg
            java.lang.String r2 = r12.zza
            com.google.android.gms.ads.internal.client.zzr r4 = r12.zzc
            com.google.android.gms.ads.internal.client.zzm r5 = r12.zzd
            java.lang.String r7 = r12.zzf
            r0 = r10
            r9 = r12
            com.google.android.gms.ads.nonagon.signalgeneration.zzac r0 = r0.zzR(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgdn.zzh(r0)
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zzb()
        L_0x0114:
            r3 = r1
        L_0x0115:
            com.google.android.gms.ads.nonagon.signalgeneration.zzaq r7 = new com.google.android.gms.ads.nonagon.signalgeneration.zzaq
            r1 = r7
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.android.gms.internal.ads.zzche r11 = r10.zzf
            java.util.concurrent.Executor r11 = r11.zzA()
            com.google.android.gms.internal.ads.zzgdn.zzr(r0, r7, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzau.zzf(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.ads.zzbze, com.google.android.gms.internal.ads.zzbyx):void");
    }

    public final void zzg(zzbui zzbui) {
        this.zzm = zzbui;
        this.zzj.zzc(1);
    }

    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbuf zzbuf) {
        zzV(list, iObjectWrapper, zzbuf, true);
    }

    public final void zzi(List list, IObjectWrapper iObjectWrapper, zzbuf zzbuf) {
        zzW(list, iObjectWrapper, zzbuf, true);
    }

    public final void zzj(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzjX)).booleanValue()) {
            zzbcv zzbcv = zzbde.zzhL;
            if (!((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue()) {
                zzU();
            }
            WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                int i = zze.zza;
                zzo.zzg("The webView cannot be null.");
                return;
            }
            zzf zzf2 = this.zzK;
            zzj zzj2 = new zzj(webView, zzf2, zzcaf.zzf);
            webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.zzh, this.zzp, this.zzq, this.zzi, this.zzJ, zzf2, zzj2), "gmaSdk");
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzkh)).booleanValue()) {
                zzv.zzp().zzs();
            }
            if (((Boolean) zzbfj.zzc.zze()).booleanValue()) {
                zzf2.zzb(webView);
                if (((Boolean) zzbfj.zzd.zze()).booleanValue()) {
                    zzcaf.zzd.scheduleWithFixedDelay(new zzi(zzj2), 0, (long) ((Integer) zzbd.zzc().zzb(zzbde.zzki)).intValue(), TimeUnit.MILLISECONDS);
                }
            }
            if (((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue()) {
                zzU();
            }
        }
    }

    public final void zzk(IObjectWrapper iObjectWrapper) {
        View view;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzhU)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzbui zzbui = this.zzm;
            if (zzbui == null) {
                view = null;
            } else {
                view = zzbui.zza;
            }
            this.zzn = zzbv.zza(motionEvent, view);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation((float) this.zzn.x, (float) this.zzn.y);
            this.zzh.zzd(obtain);
            obtain.recycle();
        }
    }

    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbuf zzbuf) {
        zzV(list, iObjectWrapper, zzbuf, false);
    }

    public final void zzm(List list, IObjectWrapper iObjectWrapper, zzbuf zzbuf) {
        zzW(list, iObjectWrapper, zzbuf, false);
    }
}
