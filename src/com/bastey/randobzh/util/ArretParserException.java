package com.bastey.randobzh.util;

/**
 * Exception non gérée.
 * @author bastey
 */
public class ArretParserException
    extends RuntimeException
{
    private static final long serialVersionUID = -951033887572914555L;

    public ArretParserException()
    {

    }

    public ArretParserException( String message )
    {
        super( message );
    }

    public ArretParserException( String message, Throwable e )
    {
        super( message, e );
    }

}
