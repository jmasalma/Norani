package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzbd;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaxl extends zzayk {
    private static final zzayl zzh = new zzayl();
    private final zzasp zzi;
    private final Context zzj;
    private final zzaup zzk;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzaxl(zzawx zzawx, String str, String str2, zzast zzast, int i, int i2, Context context, zzasg zzasg, zzasp zzasp, zzaup zzaup) {
        super(zzawx, "5l2BxulTXy+0Wovy9T0xreNvMgccuxz9Mfzqj2nIzDWreku9cf/hyHYbFP2gke7n", "rfz55QLsxMWzB2XqDjYWCElC2tXCWyMh5Hq3cP2KfWk=", zzast, i, 27);
        this.zzj = context;
        this.zzi = zzasp;
        this.zzk = zzaup;
    }

    private final zzaum zzc() throws IllegalAccessException, InvocationTargetException {
        int i;
        String str;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcW)).booleanValue()) {
            i = ((Integer) zzbd.zzc().zzb(zzbde.zzdb)).intValue();
        } else {
            i = this.zzi.zza();
        }
        zzaum zzaum = new zzaum((String) this.zze.invoke((Object) null, new Object[]{this.zzj, false, ""}));
        zzaup zzaup = this.zzk;
        if (!(zzaup == null || zzaup.zza() == null)) {
            try {
                str = (String) zzaup.zza().get((long) i, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
            zzaum.zza = str;
            return zzaum;
        }
        str = "E";
        zzaum.zza = str;
        return zzaum;
    }

    private final String zzd() {
        try {
            zzawx zzawx = this.zza;
            if (zzawx.zzk() != null) {
                zzawx.zzk().get();
            }
            zzatq zzc = zzawx.zzc();
            if (zzc == null || !zzc.zzaf()) {
                return null;
            }
            return zzc.zzg();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzaum zzaum;
        int i;
        zzaum zzaum2;
        Boolean bool;
        zzayl zzayl = zzh;
        Context context = this.zzj;
        AtomicReference zza = zzayl.zza(context.getPackageName());
        synchronized (zza) {
            zzaum zzaum3 = (zzaum) zza.get();
            if (zzaum3 == null || zzaxa.zzd(zzaum3.zza) || zzaum3.zza.equals("E") || zzaum3.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                boolean z = false;
                if (!zzaxa.zzd((String) null)) {
                    i = 5;
                } else {
                    if (!zzaxa.zzd((String) null)) {
                        bool = false;
                    } else {
                        bool = false;
                    }
                    bool.booleanValue();
                    i = 3;
                }
                if (this.zzk != null) {
                    zzaum2 = zzc();
                } else {
                    if (i == 3 && !this.zzi.zzd()) {
                        z = true;
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    Boolean bool2 = (Boolean) zzbd.zzc().zzb(zzbde.zzcK);
                    String zzb = ((Boolean) zzbd.zzc().zzb(zzbde.zzcJ)).booleanValue() ? zzb() : null;
                    if (bool2.booleanValue() && this.zza.zzo() && zzaxa.zzd(zzb)) {
                        zzb = zzd();
                    }
                    zzaum zzaum4 = new zzaum((String) this.zze.invoke((Object) null, new Object[]{context, valueOf, zzb}));
                    if (zzaxa.zzd(zzaum4.zza) || zzaum4.zza.equals("E")) {
                        int i2 = i - 1;
                        if (i2 == 3) {
                            String zzd = zzd();
                            if (!zzaxa.zzd(zzd)) {
                                zzaum4.zza = zzd;
                            }
                        } else if (i2 == 4) {
                            throw null;
                        }
                    }
                    zzaum2 = zzaum4;
                }
                zza.set(zzaum2);
            }
            zzaum = (zzaum) zza.get();
        }
        zzast zzast = this.zzd;
        synchronized (zzast) {
            if (zzaum != null) {
                zzast.zzv(zzaum.zza);
                zzast.zzV(zzaum.zzb);
                zzast.zzX(zzaum.zzc);
                zzast.zzi(zzaum.zzd);
                zzast.zzu(zzaum.zze);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final String zzb() {
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            byte[] zzf = zzaxa.zzf((String) zzbd.zzc().zzb(zzbde.zzcL));
            ArrayList arrayList = new ArrayList();
            arrayList.add(instance.generateCertificate(new ByteArrayInputStream(zzf)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(instance.generateCertificate(new ByteArrayInputStream(zzaxa.zzf((String) zzbd.zzc().zzb(zzbde.zzcM)))));
            }
            Context context = this.zzj;
            String packageName = context.getPackageName();
            this.zza.zzj();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            zzgeh zze = zzgeh.zze();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new zzaym(zze));
            return (String) zze.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
