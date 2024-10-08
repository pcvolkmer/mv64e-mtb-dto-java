package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TumorCellContentMethod {
    BIOINFORMATIC, HISTOLOGIC;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BIOINFORMATIC: return "bioinformatic";
            case HISTOLOGIC: return "histologic";
        }
        return null;
    }

    @JsonCreator
    public static TumorCellContentMethod forValue(String value) throws IOException {
        if (value.equals("bioinformatic")) return BIOINFORMATIC;
        if (value.equals("histologic")) return HISTOLOGIC;
        throw new IOException("Cannot deserialize TumorCellContentMethod");
    }
}
