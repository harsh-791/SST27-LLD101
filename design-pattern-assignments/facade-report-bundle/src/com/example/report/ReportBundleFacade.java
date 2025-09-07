package com.example.report;

import java.nio.file.*;
import java.util.*;

public class ReportBundleFacade {
    public static JsonWriter jw = new JsonWriter();
    public static Zipper z = new Zipper();
    public static AuditLog log = new AuditLog();

    public static Path export(Map<String,Object> data, Path outDir, String baseName) {
        Path json = jw.write(data, outDir, baseName);
        Path zip = z.zip(json, outDir.resolve(baseName + ".zip"));
        log.log("exported " + zip);
        return zip;
    }
}
