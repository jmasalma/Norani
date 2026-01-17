package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcu {
    private static final String zzA = Integer.toString(9, 36);
    private static final String zzB = Integer.toString(10, 36);
    private static final String zzC = Integer.toString(11, 36);
    private static final String zzD = Integer.toString(12, 36);
    private static final String zzE = Integer.toString(13, 36);
    private static final String zzF = Integer.toString(14, 36);
    private static final String zzG = Integer.toString(15, 36);
    private static final String zzH = Integer.toString(16, 36);
    private static final String zzI = Integer.toString(19, 36);
    private static final String zzq = Integer.toString(0, 36);
    private static final String zzr = Integer.toString(17, 36);
    private static final String zzs = Integer.toString(1, 36);
    private static final String zzt = Integer.toString(2, 36);
    private static final String zzu = Integer.toString(18, 36);
    private static final String zzv = Integer.toString(4, 36);
    private static final String zzw = Integer.toString(5, 36);
    private static final String zzx = Integer.toString(6, 36);
    private static final String zzy = Integer.toString(7, 36);
    private static final String zzz = Integer.toString(8, 36);
    public final CharSequence zza;
    public final Layout.Alignment zzb;
    public final Layout.Alignment zzc;
    public final Bitmap zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final float zzh;
    public final int zzi;
    public final float zzj;
    public final float zzk;
    public final int zzl;
    public final float zzm;
    public final int zzn;
    public final float zzo;
    public final int zzp;

    static {
        zzcs zzcs = new zzcs();
        zzcs.zzl("");
        zzcs.zzq();
        String str = zzex.zza;
        Integer.toString(3, 36);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        r2 = r4.zzd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        r3 = r5.zzd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            if (r5 == 0) goto L_0x0094
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L_0x0013
            goto L_0x0094
        L_0x0013:
            com.google.android.gms.internal.ads.zzcu r5 = (com.google.android.gms.internal.ads.zzcu) r5
            java.lang.CharSequence r2 = r4.zza
            java.lang.CharSequence r3 = r5.zza
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x0094
            android.text.Layout$Alignment r2 = r4.zzb
            android.text.Layout$Alignment r3 = r5.zzb
            if (r2 != r3) goto L_0x0094
            android.text.Layout$Alignment r2 = r4.zzc
            android.text.Layout$Alignment r3 = r5.zzc
            if (r2 != r3) goto L_0x0094
            android.graphics.Bitmap r2 = r4.zzd
            if (r2 != 0) goto L_0x0034
            android.graphics.Bitmap r2 = r5.zzd
            if (r2 != 0) goto L_0x0094
            goto L_0x003f
        L_0x0034:
            android.graphics.Bitmap r3 = r5.zzd
            if (r3 == 0) goto L_0x0094
            boolean r2 = r2.sameAs(r3)
            if (r2 != 0) goto L_0x003f
            goto L_0x0094
        L_0x003f:
            float r2 = r4.zze
            float r3 = r5.zze
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0094
            int r2 = r4.zzf
            int r3 = r5.zzf
            if (r2 != r3) goto L_0x0094
            int r2 = r4.zzg
            int r3 = r5.zzg
            if (r2 != r3) goto L_0x0094
            float r2 = r4.zzh
            float r3 = r5.zzh
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0094
            int r2 = r4.zzi
            int r3 = r5.zzi
            if (r2 != r3) goto L_0x0094
            float r2 = r4.zzj
            float r3 = r5.zzj
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0094
            float r2 = r4.zzk
            float r3 = r5.zzk
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0094
            int r2 = r4.zzl
            int r3 = r5.zzl
            if (r2 != r3) goto L_0x0094
            float r2 = r4.zzm
            float r3 = r5.zzm
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0094
            int r2 = r4.zzn
            int r3 = r5.zzn
            if (r2 != r3) goto L_0x0094
            float r2 = r4.zzo
            float r3 = r5.zzo
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0094
            int r2 = r4.zzp
            int r5 = r5.zzp
            if (r2 != r5) goto L_0x0094
            return r0
        L_0x0094:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcu.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        CharSequence charSequence = this.zza;
        return Objects.hash(new Object[]{charSequence, this.zzb, this.zzc, this.zzd, Float.valueOf(this.zze), Integer.valueOf(this.zzf), Integer.valueOf(this.zzg), Float.valueOf(this.zzh), Integer.valueOf(this.zzi), Float.valueOf(this.zzj), Float.valueOf(this.zzk), false, -16777216, Integer.valueOf(this.zzl), Float.valueOf(this.zzm), Integer.valueOf(this.zzn), Float.valueOf(this.zzo), Integer.valueOf(this.zzp)});
    }

    public final Bundle zza() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.zza;
        if (charSequence != null) {
            bundle.putCharSequence(zzq, charSequence);
            if (charSequence instanceof Spanned) {
                ArrayList zza2 = zzcx.zza((Spanned) charSequence);
                if (!zza2.isEmpty()) {
                    bundle.putParcelableArrayList(zzr, zza2);
                }
            }
        }
        bundle.putSerializable(zzs, this.zzb);
        bundle.putSerializable(zzt, this.zzc);
        bundle.putFloat(zzv, this.zze);
        bundle.putInt(zzw, this.zzf);
        bundle.putInt(zzx, this.zzg);
        bundle.putFloat(zzy, this.zzh);
        bundle.putInt(zzz, this.zzi);
        bundle.putInt(zzA, this.zzl);
        bundle.putFloat(zzB, this.zzm);
        bundle.putFloat(zzC, this.zzj);
        bundle.putFloat(zzD, this.zzk);
        bundle.putBoolean(zzF, false);
        bundle.putInt(zzE, -16777216);
        bundle.putInt(zzG, this.zzn);
        bundle.putFloat(zzH, this.zzo);
        bundle.putInt(zzI, this.zzp);
        Bitmap bitmap = this.zzd;
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            zzdd.zzf(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundle.putByteArray(zzu, byteArrayOutputStream.toByteArray());
        }
        return bundle;
    }

    public final zzcs zzb() {
        return new zzcs(this, (zzct) null);
    }

    /* synthetic */ zzcu(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6, int i7, zzct zzct) {
        CharSequence charSequence2 = charSequence;
        Bitmap bitmap2 = bitmap;
        if (charSequence2 == null) {
            bitmap.getClass();
        } else {
            zzdd.zzd(bitmap2 == null);
        }
        if (charSequence2 instanceof Spanned) {
            this.zza = SpannedString.valueOf(charSequence);
        } else {
            this.zza = charSequence2 != null ? charSequence.toString() : null;
        }
        this.zzb = alignment;
        this.zzc = alignment2;
        this.zzd = bitmap2;
        this.zze = f;
        this.zzf = i;
        this.zzg = i2;
        this.zzh = f2;
        this.zzi = i3;
        this.zzj = f4;
        this.zzk = f5;
        this.zzl = i4;
        this.zzm = f3;
        this.zzn = i6;
        this.zzo = f6;
        this.zzp = i7;
    }
}
