/*
    Copyright (C) 2014  Charles-Eugene LOUBAO charlesloubao95@gmail.com

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package cf.charly1811.java.utils;

import java.io.File;
import java.lang.String;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class MimeTypes {

    static Map<String, String> map;
    static
    {
        map = new HashMap<String, String>();

        map.put("3dm","x-world/x-3dmf");
        map.put("3dmf","x-world/x-3dmf");
        map.put("a","application/octet-stream");
        map.put("aab","application/x-authorware-bin");
        map.put("aam","application/x-authorware-map");
        map.put("aas","application/x-authorware-seg");
        map.put("abc","text/vndabc");
        map.put("acgi","text/html");
        map.put("afl","video/animaflex");
        map.put("ai","application/postscript");
        map.put("aif","audio/aiff");
        map.put("aif","audio/x-aiff");
        map.put("aifc","audio/aiff");
        map.put("aifc","audio/x-aiff");
        map.put("aiff","audio/aiff");
        map.put("aiff","audio/x-aiff");
        map.put("aim","application/x-aim");
        map.put("aip","text/x-audiosoft-intra");
        map.put("ani","application/x-navi-animation");
        map.put("aos","application/x-nokia-9000-communicator-add-on-software");
        map.put("aps","application/mime");
        map.put("arc","application/octet-stream");
        map.put("arj","application/arj");
        map.put("arj","application/octet-stream");
        map.put("art","image/x-jg");
        map.put("asf","video/x-ms-asf");
        map.put("asm","text/x-asm");
        map.put("asp","text/asp");
        map.put("asx","application/x-mplayer2");
        map.put("asx","video/x-ms-asf");
        map.put("asx","video/x-ms-asf-plugin");
        map.put("au","audio/basic");
        map.put("au","audio/x-au");
        map.put("avi","application/x-troff-msvideo");
        map.put("avi","video/avi");
        map.put("avi","video/msvideo");
        map.put("avi","video/x-msvideo");
        map.put("avs","video/avs-video");
        map.put("bcpio","application/x-bcpio");
        map.put("bin","application/mac-binary");
        map.put("bin","application/macbinary");
        map.put("bin","application/octet-stream");
        map.put("bin","application/x-binary");
        map.put("bin","application/x-macbinary");
        map.put("bm","image/bmp");
        map.put("bmp","image/bmp");
        map.put("bmp","image/x-windows-bmp");
        map.put("boo","application/book");
        map.put("book","application/book");
        map.put("boz","application/x-bzip2");
        map.put("bsh","application/x-bsh");
        map.put("bz","application/x-bzip");
        map.put("bz2","application/x-bzip2");
        map.put("c","text/plain");
        map.put("c","text/x-c");
        map.put("c++","text/plain");
        map.put("cat","application/vndms-pkiseccat");
        map.put("cc","text/plain");
        map.put("cc","text/x-c");
        map.put("ccad","application/clariscad");
        map.put("cco","application/x-cocoa");
        map.put("cdf","application/cdf");
        map.put("cdf","application/x-cdf");
        map.put("cdf","application/x-netcdf");
        map.put("cer","application/pkix-cert");
        map.put("cer","application/x-x509-ca-cert");
        map.put("cha","application/x-chat");
        map.put("chat","application/x-chat");
        map.put("class","application/java");
        map.put("class","application/java-byte-code");
        map.put("class","application/x-java-class");
        map.put("com","application/octet-stream");
        map.put("com","text/plain");
        map.put("conf","text/plain");
        map.put("cpio","application/x-cpio");
        map.put("cpp","text/x-c");
        map.put("cpt","application/mac-compactpro");
        map.put("cpt","application/x-compactpro");
        map.put("cpt","application/x-cpt");
        map.put("crl","application/pkcs-crl");
        map.put("crl","application/pkix-crl");
        map.put("crt","application/pkix-cert");
        map.put("crt","application/x-x509-ca-cert");
        map.put("crt","application/x-x509-user-cert");
        map.put("csh","application/x-csh");
        map.put("csh","text/x-scriptcsh");
        map.put("css","application/x-pointplus");
        map.put("css","text/css");
        map.put("cxx","text/plain");
        map.put("dcr","application/x-director");
        map.put("deepv","application/x-deepv");
        map.put("def","text/plain");
        map.put("der","application/x-x509-ca-cert");
        map.put("dif","video/x-dv");
        map.put("dir","application/x-director");
        map.put("dl","video/dl");
        map.put("dl","video/x-dl");
        map.put("doc","application/msword");
        map.put("dot","application/msword");
        map.put("dp","application/commonground");
        map.put("drw","application/drafting");
        map.put("dump","application/octet-stream");
        map.put("dv","video/x-dv");
        map.put("dvi","application/x-dvi");
        map.put("dwf","drawing/x-dwf (old)");
        map.put("dwf","model/vnddwf");
        map.put("dwg","application/acad");
        map.put("dwg","image/vnddwg");
        map.put("dwg","image/x-dwg");
        map.put("dxf","application/dxf");
        map.put("dxf","image/vnddwg");
        map.put("dxf","image/x-dwg");
        map.put("dxr","application/x-director");
        map.put("el","text/x-scriptelisp");
        map.put("elc","application/x-bytecodeelisp (compiled elisp)");
        map.put("elc","application/x-elc");
        map.put("env","application/x-envoy");
        map.put("eps","application/postscript");
        map.put("es","application/x-esrehber");
        map.put("etx","text/x-setext");
        map.put("evy","application/envoy");
        map.put("evy","application/x-envoy");
        map.put("exe","application/octet-stream");
        map.put("f","text/plain");
        map.put("f","text/x-fortran");
        map.put("f77","text/x-fortran");
        map.put("f90","text/plain");
        map.put("f90","text/x-fortran");
        map.put("fdf","application/vndfdf");
        map.put("fif","application/fractals");
        map.put("fif","image/fif");
        map.put("fli","video/fli");
        map.put("fli","video/x-fli");
        map.put("flo","image/florian");
        map.put("flv","video/x-flv");
        map.put("flx","text/vndfmiflexstor");
        map.put("fmf","video/x-atomic3d-feature");
        map.put("for","text/plain");
        map.put("for","text/x-fortran");
        map.put("fpx","image/vndfpx");
        map.put("fpx","image/vndnet-fpx");
        map.put("frl","application/freeloader");
        map.put("funk","audio/make");
        map.put("g","text/plain");
        map.put("g3","image/g3fax");
        map.put("gif","image/gif");
        map.put("gl","video/gl");
        map.put("gl","video/x-gl");
        map.put("gsd","audio/x-gsm");
        map.put("gsm","audio/x-gsm");
        map.put("gsp","application/x-gsp");
        map.put("gss","application/x-gss");
        map.put("gtar","application/x-gtar");
        map.put("gz","application/x-compressed");
        map.put("gz","application/x-gzip");
        map.put("gzip","application/x-gzip");
        map.put("gzip","multipart/x-gzip");
        map.put("h","text/plain");
        map.put("h","text/x-h");
        map.put("hdf","application/x-hdf");
        map.put("help","application/x-helpfile");
        map.put("hgl","application/vndhp-hpgl");
        map.put("hh","text/plain");
        map.put("hh","text/x-h");
        map.put("hlb","text/x-script");
        map.put("hlp","application/hlp");
        map.put("hlp","application/x-helpfile");
        map.put("hlp","application/x-winhelp");
        map.put("hpg","application/vndhp-hpgl");
        map.put("hpgl","application/vndhp-hpgl");
        map.put("hqx","application/binhex");
        map.put("hqx","application/binhex4");
        map.put("hqx","application/mac-binhex");
        map.put("hqx","application/mac-binhex40");
        map.put("hqx","application/x-binhex40");
        map.put("hqx","application/x-mac-binhex40");
        map.put("hta","application/hta");
        map.put("htc","text/x-component");
        map.put("htm","text/html");
        map.put("html","text/html");
        map.put("htmls","text/html");
        map.put("htt","text/webviewhtml");
        map.put("htx","text/html");
        map.put("ice","x-conference/x-cooltalk");
        map.put("ico","image/x-icon");
        map.put("idc","text/plain");
        map.put("ief","image/ief");
        map.put("iefs","image/ief");
        map.put("iges","application/iges");
        map.put("iges","model/iges");
        map.put("igs","application/iges");
        map.put("igs","model/iges");
        map.put("ima","application/x-ima");
        map.put("imap","application/x-httpd-imap");
        map.put("inf","application/inf");
        map.put("ins","application/x-internett-signup");
        map.put("ip","application/x-ip2");
        map.put("isu","video/x-isvideo");
        map.put("it","audio/it");
        map.put("iv","application/x-inventor");
        map.put("ivr","i-world/i-vrml");
        map.put("ivy","application/x-livescreen");
        map.put("jam","audio/x-jam");
        map.put("jav","text/plain");
        map.put("jav","text/x-java-source");
        map.put("java","text/plain");
        map.put("java","text/x-java-source");
        map.put("jcm","application/x-java-commerce");
        map.put("jfif","image/jpeg");
        map.put("jfif","image/pjpeg");
        map.put("jfif-tbnl","image/jpeg");
        map.put("jpe","image/jpeg");
        map.put("jpe","image/pjpeg");
        map.put("jpeg","image/jpeg");
        map.put("jpeg","image/pjpeg");
        map.put("jpg","image/jpeg");
        map.put("jpg","image/pjpeg");
        map.put("jps","image/x-jps");
        map.put("js","application/x-javascript");
        map.put("jut","image/jutvision");
        map.put("kar","audio/midi");
        map.put("kar","music/x-karaoke");
        map.put("ksh","application/x-ksh");
        map.put("ksh","text/x-scriptksh");
        map.put("la","audio/nspaudio");
        map.put("la","audio/x-nspaudio");
        map.put("lam","audio/x-liveaudio");
        map.put("latex","application/x-latex");
        map.put("lha","application/lha");
        map.put("lha","application/octet-stream");
        map.put("lha","application/x-lha");
        map.put("lhx","application/octet-stream");
        map.put("list","text/plain");
        map.put("lma","audio/nspaudio");
        map.put("lma","audio/x-nspaudio");
        map.put("log","text/plain");
        map.put("lsp","application/x-lisp");
        map.put("lsp","text/x-scriptlisp");
        map.put("lst","text/plain");
        map.put("lsx","text/x-la-asf");
        map.put("ltx","application/x-latex");
        map.put("lzh","application/octet-stream");
        map.put("lzh","application/x-lzh");
        map.put("lzx","application/lzx");
        map.put("lzx","application/octet-stream");
        map.put("lzx","application/x-lzx");
        map.put("m","text/plain");
        map.put("m","text/x-m");
        map.put("m1v","video/mpeg");
        map.put("m2a","audio/mpeg");
        map.put("m2v","video/mpeg");
        map.put("m3u","audio/x-mpequrl");
        map.put("man","application/x-troff-man");
        map.put("map","application/x-navimap");
        map.put("mar","text/plain");
        map.put("mbd","application/mbedlet");
        map.put("mc$","application/x-magic-cap-package-10");
        map.put("mcd","application/mcad");
        map.put("mcf","image/vasa");
        map.put("mcf","text/mcf");
        map.put("mcp","application/netmc");
        map.put("me","application/x-troff-me");
        map.put("mht","message/rfc822");
        map.put("mhtml","message/rfc822");
        map.put("midi","audio/midi");
        map.put("midi","music/crescendo");
        map.put("midi","x-music/x-midi");
        map.put("mif","application/x-frame");
        map.put("mif","application/x-mif");
        map.put("mime","message/rfc822");
        map.put("mime","www/mime");
        map.put("mjf","audio/x-vndaudioexplosionmjuicemediafile");
        map.put("mjpg","video/x-motion-jpeg");
        map.put("mkv","video/x-matroska");
        map.put("mka","audio/x-matroska");
        map.put("mm","application/x-meme");
        map.put("mme","application/base64");
        map.put("mod","audio/mod");
        map.put("moov","video/quicktime");
        map.put("mov","video/quicktime");
        map.put("movie","video/x-sgi-movie");
        map.put("mp2","audio/mpeg");
        map.put("mp3","audio/mpeg3");
        map.put("mp4", "video/mp4");
        map.put("mpa","audio/mpeg");
        map.put("mpa","video/mpeg");
        map.put("mpc","application/x-project");
        map.put("mpe","video/mpeg");
        map.put("mpeg","video/mpeg");
        map.put("mpg","audio/mpeg");
        map.put("mpg","video/mpeg");
        map.put("mpga","audio/mpeg");
        map.put("mpp","application/vndms-project");
        map.put("mpt","application/x-project");
        map.put("mpv","application/x-project");
        map.put("mpx","application/x-project");
        map.put("mrc","application/marc");
        map.put("ms","application/x-troff-ms");
        map.put("mv","video/x-sgi-movie");
        map.put("my","audio/make");
        map.put("mzz","application/x-vndaudioexplosionmzz");
        map.put("nap","image/naplps");
        map.put("naplps","image/naplps");
        map.put("nc","application/x-netcdf");
        map.put("ncm","application/vndnokiaconfiguration-message");
        map.put("nif","image/x-niff");
        map.put("niff","image/x-niff");
        map.put("nix","application/x-mix-transfer");
        map.put("nsc","application/x-conference");
        map.put("nvd","application/x-navidoc");
        map.put("o","application/octet-stream");
        map.put("oda","application/oda");
        map.put("omc","application/x-omc");
        map.put("omcd","application/x-omcdatamaker");
        map.put("omcr","application/x-omcregerator");
        map.put("p","text/x-pascal");
        map.put("p10","application/pkcs10");
        map.put("p10","application/x-pkcs10");
        map.put("p12","application/pkcs-12");
        map.put("p12","application/x-pkcs12");
        map.put("p7a","application/x-pkcs7-signature");
        map.put("p7c","application/pkcs7-mime");
        map.put("p7c","application/x-pkcs7-mime");
        map.put("p7m","application/pkcs7-mime");
        map.put("p7m","application/x-pkcs7-mime");
        map.put("p7r","application/x-pkcs7-certreqresp");
        map.put("p7s","application/pkcs7-signature");
        map.put("part","application/pro_eng");
        map.put("pas","text/pascal");
        map.put("pbm","image/x-portable-bitmap");
        map.put("pcl","application/vndhp-pcl");
        map.put("pcl","application/x-pcl");
        map.put("pct","image/x-pict");
        map.put("pcx","image/x-pcx");
        map.put("pdb","chemical/x-pdb");
        map.put("pdf","application/pdf");
        map.put("pfunk","audio/make");
        map.put("pfunk","audio/makemyfunk");
        map.put("pgm","image/x-portable-graymap");
        map.put("pgm","image/x-portable-greymap");
        map.put("pic","image/pict");
        map.put("pict","image/pict");
        map.put("pkg","application/x-newton-compatible-pkg");
        map.put("pko","application/vndms-pkipko");
        map.put("pl","text/plain");
        map.put("pl","text/x-scriptperl");
        map.put("plx","application/x-pixclscript");
        map.put("pm","image/x-xpixmap");
        map.put("pm","text/x-scriptperl-module");
        map.put("pm4","application/x-pagemaker");
        map.put("pm5","application/x-pagemaker");
        map.put("png","image/png");
        map.put("pnm","application/x-portable-anymap");
        map.put("pnm","image/x-portable-anymap");
        map.put("pot","application/mspowerpoint");
        map.put("pot","application/vndms-powerpoint");
        map.put("pov","model/x-pov");
        map.put("ppa","application/vndms-powerpoint");
        map.put("ppm","image/x-portable-pixmap");
        map.put("pps","application/mspowerpoint");
        map.put("pps","application/vndms-powerpoint");
        map.put("ppt","application/mspowerpoint");
        map.put("ppt","application/powerpoint");
        map.put("ppt","application/vndms-powerpoint");
        map.put("ppt","application/x-mspowerpoint");
        map.put("ppz","application/mspowerpoint");
        map.put("pre","application/x-freelance");
        map.put("prt","application/pro_eng");
        map.put("ps","application/postscript");
        map.put("psd","application/octet-stream");
        map.put("pvu","paleovu/x-pv");
        map.put("pwz","application/vndms-powerpoint");
        map.put("py","text/x-scriptphyton");
        map.put("pyc","applicaiton/x-bytecodepython");
        map.put("qcp","audio/vndqcelp");
        map.put("qd3","x-world/x-3dmf");
        map.put("qd3d","x-world/x-3dmf");
        map.put("qif","image/x-quicktime");
        map.put("qt","video/quicktime");
        map.put("qtc","video/x-qtc");
        map.put("qti","image/x-quicktime");
        map.put("qtif","image/x-quicktime");
        map.put("ra","audio/x-pn-realaudio");
        map.put("ra","audio/x-pn-realaudio-plugin");
        map.put("ra","audio/x-realaudio");
        map.put("ram","audio/x-pn-realaudio");
        map.put("ras","application/x-cmu-raster");
        map.put("ras","image/cmu-raster");
        map.put("ras","image/x-cmu-raster");
        map.put("rast","image/cmu-raster");
        map.put("rexx","text/x-scriptrexx");
        map.put("rf","image/vndrn-realflash");
        map.put("rgb","image/x-rgb");
        map.put("rm","application/vndrn-realmedia");
        map.put("rm","audio/x-pn-realaudio");
        map.put("rmi","audio/mid");
        map.put("rmm","audio/x-pn-realaudio");
        map.put("rmp","audio/x-pn-realaudio");
        map.put("rmp","audio/x-pn-realaudio-plugin");
        map.put("rng","application/ringing-tones");
        map.put("rng","application/vndnokiaringing-tone");
        map.put("rnx","application/vndrn-realplayer");
        map.put("roff","application/x-troff");
        map.put("rp","image/vndrn-realpix");
        map.put("rpm","audio/x-pn-realaudio-plugin");
        map.put("rt","text/richtext");
        map.put("rt","text/vndrn-realtext");
        map.put("rtf","application/rtf");
        map.put("rtf","application/x-rtf");
        map.put("rtf","text/richtext");
        map.put("rtx","application/rtf");
        map.put("rtx","text/richtext");
        map.put("rv","video/vndrn-realvideo");
        map.put("s","text/x-asm");
        map.put("s3m","audio/s3m");
        map.put("saveme","application/octet-stream");
        map.put("sbk","application/x-tbook");
        map.put("scm","application/x-lotusscreencam");
        map.put("scm","text/x-scriptguile");
        map.put("scm","text/x-scriptscheme");
        map.put("scm","video/x-scm");
        map.put("sdml","text/plain");
        map.put("sdp","application/sdp");
        map.put("sdp","application/x-sdp");
        map.put("sdr","application/sounder");
        map.put("sea","application/sea");
        map.put("sea","application/x-sea");
        map.put("set","application/set");
        map.put("sgm","text/sgml");
        map.put("sgm","text/x-sgml");
        map.put("sgml","text/sgml");
        map.put("sgml","text/x-sgml");
        map.put("sh","application/x-bsh");
        map.put("sh","application/x-sh");
        map.put("sh","application/x-shar");
        map.put("sh","text/x-scriptsh");
        map.put("shar","application/x-bsh");
        map.put("shar","application/x-shar");
        map.put("shtml","text/html");
        map.put("shtml","text/x-server-parsed-html");
        map.put("sid","audio/x-psid");
        map.put("sit","application/x-sit");
        map.put("sit","application/x-stuffit");
        map.put("skd","application/x-koan");
        map.put("skm","application/x-koan");
        map.put("skp","application/x-koan");
        map.put("skt","application/x-koan");
        map.put("sl","application/x-seelogo");
        map.put("smi","application/smil");
        map.put("smil","application/smil");
        map.put("snd","audio/basic");
        map.put("snd","audio/x-adpcm");
        map.put("sol","application/solids");
        map.put("spc","application/x-pkcs7-certificates");
        map.put("spc","text/x-speech");
        map.put("spl","application/futuresplash");
        map.put("spr","application/x-sprite");
        map.put("sprite","application/x-sprite");
        map.put("src","application/x-wais-source");
        map.put("ssi","text/x-server-parsed-html");
        map.put("ssm","application/streamingmedia");
        map.put("sst","application/vndms-pkicertstore");
        map.put("step","application/step");
        map.put("stl","application/sla");
        map.put("stl","application/vndms-pkistl");
        map.put("stl","application/x-navistyle");
        map.put("stp","application/step");
        map.put("sv4cpio","application/x-sv4cpio");
        map.put("sv4crc","application/x-sv4crc");
        map.put("svf","image/vnddwg");
        map.put("svf","image/x-dwg");
        map.put("svr","application/x-world");
        map.put("svr","x-world/x-svr");
        map.put("swf","application/x-shockwave-flash");
        map.put("t","application/x-troff");
        map.put("talk","text/x-speech");
        map.put("tar","application/x-tar");
        map.put("tbk","application/toolbook");
        map.put("tbk","application/x-tbook");
        map.put("tcl","application/x-tcl");
        map.put("tcl","text/x-scripttcl");
        map.put("tcsh","text/x-scripttcsh");
        map.put("tex","application/x-tex");
        map.put("texi","application/x-texinfo");
        map.put("texinfo","application/x-texinfo");
        map.put("text","text/plain");
        map.put("tgz","application/gnutar");
        map.put("tgz","application/x-compressed");
        map.put("tif","image/tiff");
        map.put("tif","image/x-tiff");
        map.put("tiff","image/tiff");
        map.put("tiff","image/x-tiff");
        map.put("tr","application/x-troff");
        map.put("tsi","audio/tsp-audio");
        map.put("tsp","application/dsptype");
        map.put("tsp","audio/tsplayer");
        map.put("tsv","text/tab-separated-values");
        map.put("turbot","image/florian");
        map.put("txt","text/plain");
        map.put("uil","text/x-uil");
        map.put("uni","text/uri-list");
        map.put("unis","text/uri-list");
        map.put("unv","application/i-deas");
        map.put("uri","text/uri-list");
        map.put("uris","text/uri-list");
        map.put("ustar","application/x-ustar");
        map.put("ustar","multipart/x-ustar");
        map.put("uu","application/octet-stream");
        map.put("uu","text/x-uuencode");
        map.put("uue","text/x-uuencode");
        map.put("vcd","application/x-cdlink");
        map.put("vcs","text/x-vcalendar");
        map.put("vda","application/vda");
        map.put("vdo","video/vdo");
        map.put("vew","application/groupwise");
        map.put("viv","video/vivo");
        map.put("viv","video/vndvivo");
        map.put("vivo","video/vivo");
        map.put("vivo","video/vndvivo");
        map.put("vmd","application/vocaltec-media-desc");
        map.put("vmf","application/vocaltec-media-file");
        map.put("voc","audio/voc");
        map.put("voc","audio/x-voc");
        map.put("vos","video/vosaic");
        map.put("vox","audio/voxware");
        map.put("vqe","audio/x-twinvq-plugin");
        map.put("vqf","audio/x-twinvq");
        map.put("vql","audio/x-twinvq-plugin");
        map.put("vrml","application/x-vrml");
        map.put("vrml","model/vrml");
        map.put("vrml","x-world/x-vrml");
        map.put("vrt","x-world/x-vrt");
        map.put("vsd","application/x-visio");
        map.put("vst","application/x-visio");
        map.put("vsw","application/x-visio");
        map.put("w60","application/wordperfect60");
        map.put("w61","application/wordperfect61");
        map.put("w6w","application/msword");
        map.put("wav","audio/wav");
        map.put("wav","audio/x-wav");
        map.put("wb1","application/x-qpro");
        map.put("wbmp","image/vndwapwbmp");
        map.put("web","application/vndxara");
        map.put("wiz","application/msword");
        map.put("wk1","application/x-123");
        map.put("wmf","windows/metafile");
        map.put("wml","text/vndwapwml");
        map.put("wmlc","application/vndwapwmlc");
        map.put("wmls","text/vndwapwmlscript");
        map.put("wmlsc","application/vndwapwmlscriptc");
        map.put(".wmv","video/x-ms-wmv");
        map.put("word","application/msword");
        map.put("wp","application/wordperfect");
        map.put("wp5","application/wordperfect");
        map.put("wp5","application/wordperfect60");
        map.put("wp6","application/wordperfect");
        map.put("wpd","application/wordperfect");
        map.put("wpd","application/x-wpwin");
        map.put("wq1","application/x-lotus");
        map.put("wri","application/mswrite");
        map.put("wri","application/x-wri");
        map.put("wrl","application/x-world");
        map.put("wrl","model/vrml");
        map.put("wrl","x-world/x-vrml");
        map.put("wrz","model/vrml");
        map.put("wrz","x-world/x-vrml");
        map.put("wsc","text/scriplet");
        map.put("wsrc","application/x-wais-source");
        map.put("webm","video/webm");
        map.put("wtk","application/x-wintalk");
        map.put("xbm","image/x-xbitmap");
        map.put("xbm","image/x-xbm");
        map.put("xbm","image/xbm");
        map.put("xdr","video/x-amt-demorun");
        map.put("xgz","xgl/drawing");
        map.put("xif","image/vndxiff");
        map.put("xl","application/excel");
        map.put("xla","application/excel");
        map.put("xla","application/x-excel");
        map.put("xla","application/x-msexcel");
        map.put("xlb","application/excel");
        map.put("xlb","application/vndms-excel");
        map.put("xlb","application/x-excel");
        map.put("xlc","application/excel");
        map.put("xlc","application/vndms-excel");
        map.put("xlc","application/x-excel");
        map.put("xld","application/excel");
        map.put("xld","application/x-excel");
        map.put("xlk","application/excel");
        map.put("xll","application/excel");
        map.put("xlm","application/excel");
        map.put("xls","application/excel");
        map.put("xlt","application/excel");
        map.put("xlv","application/excel");
        map.put("xlw","application/excel");
        map.put("xm","audio/xm");
        map.put("xml","text/xml");
        map.put("xmz","xgl/movie");
        map.put("xpix","application/x-vndls-xpix");
        map.put("xpm","image/xpm");
        map.put("x-png","image/png");
        map.put("xsr","video/x-amt-showrun");
        map.put("xwd","image/x-xwd");
        map.put("xwd","image/x-xwindowdump");
        map.put("xyz","chemical/x-pdb");
        map.put("z","application/x-compress");
        map.put("z","application/x-compressed");
        map.put("zip","application/zip");
        map.put("zip","multipart/x-zip");
        map.put("zoo","application/octet-stream");
        map.put("zsh","text/x-scriptzsh");
    }


     public static String getMimeType(String filePath) {
         String extension = getExtension(filePath);
         if(extension != null) {
             String mimeType = map.get(extension);
             return mimeType != null ? mimeType : "application/octet-stream";
         }
         else {
             return "application/octet-stream";
         }
     }

    public static String getMimeType(URL url) {
        return getMimeType(new File(url.getFile()));
    }
     
    public static String getExtension(File file)
    {
        String name = file.getName();
        int i = name.lastIndexOf(".");
        if(i > 0)
        {
            return name.substring(i+1);
        }
        else
        {
            return null;
        }
    }
    
    public static String getExtension(String name)
    {
        int i = name.lastIndexOf(".");
        if(i > 0)
        {
            return name.substring(i+1);
        }
        else
        {
            return null;
        }
    }

    /**
     * Add a new MimeType to the list. </p>
     * <b>Note:</b> this MimeType will be registered until the application is closed
     * @param extension
     * @param mimeType
     */
    public void addMimeType(String extension,String mimeType) {
        map.put(extension,mimeType);
    }

    /**
     * <p>
     *  Get the MimeType of a file based from its extension.
     *  <br>
     *  </p>
     * @param file
     * @return the mimetype of the file or the generic extension: (application/octet-stream)
     */
    public static String getMimeType(File file)
    {
        int i = file.getName().lastIndexOf(".");
        if(i > 0)
        {
            String extension = getExtension(file);
            return map.get(extension);
        }
        else
        {
            return "application/octet-stream";
        }
    }
}
