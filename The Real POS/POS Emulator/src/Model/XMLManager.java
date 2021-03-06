/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.beans.XMLEncoder;
import java.beans.XMLDecoder;
import java.io.*;

/**
 * This class provides object persistence functionality for our template.
 *
 * @author Team 8
 */
public class XMLManager {

    public XMLManager() {
        //Nothing here, just making a constructor.
    }

    /**
     * This method saves our template object to an XML file so that it can be
     * opened by our emulator, and so that our editor can open an already edited
     * project.
     *
     * @param saveObject This parameter takes as an argument the object to be
     * parsed and saved.
     * @param fileName This parameter takes as an argument the name we intend to
     * save our file under.
     * @throws Exception If the file ain't there, we have a problem.
     */
    public void write(Template saveObject, File file) throws Exception {
        XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(file)));
        encoder.writeObject(saveObject);
        encoder.close();
    }

    /**
     * This method reads our template file if it is already in the proper
     * directory. This allows our editor to pull up a file on which the user has
     * previously worked.
     *
     * @param fileName Takes as an argument the file we want to read into the
     * editor
     * @return returns a complete Template object.
     * @throws Exception If that sucker doesn't open, we have problems.
     */
    public Template read(File file) throws Exception {
        XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(file)));
        Template readTemplate = (Template) decoder.readObject();
        return readTemplate;
    }

}
