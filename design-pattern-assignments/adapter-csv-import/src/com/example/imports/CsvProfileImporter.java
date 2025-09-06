package com.example.imports;

import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

public class CsvProfileImporter implements ProfileImporter {
    private NaiveCsvReader naiveCsvReader;
    private ProfileService profileService;

    public CsvProfileImporter(NaiveCsvReader naiveCsvReader, ProfileService profileService) {
        this.naiveCsvReader = naiveCsvReader;
        this.profileService = profileService;
    }

    @Override
    public int importFrom(Path csvFile) {
        Objects.requireNonNull(csvFile, "csvFile cannot be null");
        List<String[]> rows = naiveCsvReader.read(csvFile);
        int count = 0;

        for (String[] row : rows) {
            if (isValid(row)) {
                String id = row[0].trim();
                String email = row[1].trim();
                String displayName = row[2].trim();

                profileService.createProfile(id, email, displayName);
                System.out.println("Created: " + id + " " + email + " " + displayName);
                count++;
            } else {
                System.out.println("Skipped invalid row: " + String.join(",", row));
            }
        }
        return count;
    }

    private boolean isValid(String[] row) {
        if (row == null || row.length < 3) {
            return false;
        }
        if (row[0] == null || row[0].trim().isEmpty()) {
            return false;
        }
        if (row[1] == null || row[1].trim().isEmpty() || !row[1].contains("@")) {
            return false;
        }
        if (row[2] == null || row[2].trim().isEmpty()) {
            return false;
        }

        return true;
    }
}