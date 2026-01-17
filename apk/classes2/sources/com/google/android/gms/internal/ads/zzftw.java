package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzftw {
    public static final /* synthetic */ int zzb = 0;
    private static final zzfuo zzc = new zzfuo("OverlayDisplayService");
    private static final Intent zzd = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    final zzfun zza;
    private final String zze;

    zzftw(Context context) {
        if (zzfuq.zza(context)) {
            this.zza = new zzfun(context.getApplicationContext(), zzc, "OverlayDisplayService", zzd, new zzfts());
        } else {
            this.zza = null;
        }
        this.zze = context.getPackageName();
    }

    public static /* synthetic */ void zza(zzftw zzftw, zzfud zzfud, int i, zzfub zzfub) {
        try {
            zzfun zzfun = zzftw.zza;
            if (zzfun != null) {
                zzfun zzfun2 = zzfun;
                zzfsn zzfsn = (zzfsn) zzfun.zzc();
                if (zzfsn != null) {
                    String str = zzftw.zze;
                    Bundle bundle = new Bundle();
                    bundle.putString("callerPackage", str);
                    bundle.putInt("displayMode", i);
                    zzi(zzfud.zzb(), new zzfth(bundle));
                    zzi(zzfud.zza(), new zzftn(bundle));
                    zzfsn.zzg(bundle, new zzftv(zzftw, zzfub));
                    return;
                }
                return;
            }
            throw null;
        } catch (RemoteException e) {
            zzc.zzb(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i), zzftw.zze);
        }
    }

    public static /* synthetic */ void zzb(zzftw zzftw, zzftd zzftd, zzfub zzfub) {
        try {
            zzfun zzfun = zzftw.zza;
            if (zzfun != null) {
                zzfun zzfun2 = zzfun;
                zzfsn zzfsn = (zzfsn) zzfun.zzc();
                if (zzfsn != null) {
                    String str = zzftw.zze;
                    Bundle bundle = new Bundle();
                    bundle.putString("callerPackage", str);
                    zzi(zzftd.zzb(), new zzftp(bundle));
                    zzi(zzftd.zza(), new zzftq(bundle));
                    zzfsn.zze(bundle, new zzftv(zzftw, zzfub));
                    return;
                }
                return;
            }
            throw null;
        } catch (RemoteException e) {
            zzc.zzb(e, "dismiss overlay display from: %s", zzftw.zze);
        }
    }

    public static /* synthetic */ void zzc(zzftw zzftw, zzfty zzfty, zzfub zzfub) {
        try {
            zzfun zzfun = zzftw.zza;
            if (zzfun != null) {
                zzfun zzfun2 = zzfun;
                zzfsn zzfsn = (zzfsn) zzfun.zzc();
                if (zzfsn != null) {
                    String str = zzftw.zze;
                    Bundle bundle = new Bundle();
                    bundle.putString("callerPackage", str);
                    bundle.putBinder("windowToken", zzfty.zzf());
                    zzi(zzfty.zzg(), new zzftu(bundle));
                    bundle.putInt("layoutGravity", zzfty.zzc());
                    bundle.putFloat("layoutVerticalMargin", zzfty.zza());
                    bundle.putInt("displayMode", 0);
                    bundle.putInt("triggerMode", 0);
                    bundle.putInt("windowWidthPx", zzfty.zze());
                    zzi((String) null, new zzfti(bundle));
                    zzi((String) null, new zzftj(bundle));
                    zzi(zzfty.zzh(), new zzftk(bundle));
                    zzi((String) null, new zzftl(bundle));
                    bundle.putBoolean("stableSessionToken", true);
                    zzfsn.zzf(str, bundle, new zzftv(zzftw, zzfub));
                    return;
                }
                return;
            }
            throw null;
        } catch (RemoteException e) {
            zzc.zzb(e, "show overlay display from: %s", zzftw.zze);
        }
    }

    static /* synthetic */ boolean zzh(String str) {
        return !zzk(str);
    }

    private static void zzi(String str, Consumer consumer) {
        if (!zzk(str)) {
            str.getClass();
            String str2 = str;
            consumer.accept(str.trim());
        }
    }

    private static boolean zzj(zzfub zzfub, String str, List list) {
        if (list.stream().anyMatch(new zzftt())) {
            return true;
        }
        zzc.zza(str, new Object[0]);
        zzftz zzc2 = zzfua.zzc();
        zzc2.zzb(8160);
        zzfub.zza(zzc2.zzc());
        return false;
    }

    private static boolean zzk(String str) {
        return zzfwg.zzc(str).trim().isEmpty();
    }

    /* access modifiers changed from: package-private */
    public final void zzd() {
        zzfun zzfun = this.zza;
        if (zzfun != null) {
            zzc.zzc("unbind LMD display overlay service", new Object[0]);
            zzfun.zzn();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zze(zzftd zzftd, zzfub zzfub) {
        zzfun zzfun = this.zza;
        if (zzfun == null) {
            zzc.zza("error: %s", "Play Store not found.");
            return;
        }
        if (zzj(zzfub, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(new String[]{zzftd.zzb(), zzftd.zza()}))) {
            zzfun.zzm(new zzftm(this, zzftd, zzfub));
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzf(zzfty zzfty, zzfub zzfub) {
        zzfun zzfun = this.zza;
        if (zzfun == null) {
            zzc.zza("error: %s", "Play Store not found.");
            return;
        }
        if (zzj(zzfub, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(new String[]{null, zzfty.zzh()}))) {
            zzfun.zzm(new zzftr(this, zzfty, zzfub));
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzg(zzfud zzfud, zzfub zzfub, int i) {
        zzfun zzfun = this.zza;
        if (zzfun == null) {
            zzc.zza("error: %s", "Play Store not found.");
            return;
        }
        if (zzj(zzfub, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(new String[]{zzfud.zzb(), zzfud.zza()}))) {
            zzfun.zzm(new zzfto(this, zzfud, i, zzfub));
        }
    }
}
