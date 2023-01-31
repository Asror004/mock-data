package com.company;

import java.util.function.Supplier;

public enum FileType {
    /**
     * JSON TYPE FOR ****
     */
    JSON,
    CSV, SQL;

    public static FileType findByName(String name) {
        String aa = "123";
        Supplier<Integer> c = aa :: length;
        for ( FileType fileType : values() ) {
            if ( fileType.name().equalsIgnoreCase(name) )
                return fileType;
        }
        return FileType.JSON;
    }

}
