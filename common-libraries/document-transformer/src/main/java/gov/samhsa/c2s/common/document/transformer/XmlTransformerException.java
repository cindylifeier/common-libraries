package gov.samhsa.c2s.common.document.transformer;

public class XmlTransformerException extends RuntimeException {
    public XmlTransformerException(String message) {
        super(message);
    }

    public XmlTransformerException(String message, Throwable cause) {
        super(message, cause);
    }
}
