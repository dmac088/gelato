package io.nzbee.keymaps.hkpost.shipping.weight;

import java.util.ResourceBundle;

public class WeightLimits {

	private static final String propertySuffix = ".max";
	
    /**
     * Retrieves the value for the messageKey from the locale-specific messages.properties, or from
     * the base messages.properties for unsupported locales.
     *
     * @param messageKey The key for the message in the messages.properties ResourceBundle.
     * @param locale The locale to search the message key.
     * @return The value defined for the messageKey in the provided locale.
     */
    public static String getWeightLimit(String messageKey) {

        /*
         * For more complex implementations, you will want a var-args parameter for MessageFormat
         * substitutions. Then we can read the value from the bundle and pass the value with the
         * substitutions to MessageFormat to create the final message value.
         */
        return ResourceBundle.getBundle("weightlimits")
            .getString(messageKey + propertySuffix);
    }

}