package com.aurionpro.day22.proxy.model;

import java.util.logging.Logger;

public class ProxyStructuralDesign implements StructuralDesigns {

    private static final Logger logger = Logger.getLogger(ProxyStructuralDesign.class.getName());
    private RealStructuralDesign realStructuralDesign;
    private boolean isAnalysisPerformed = false;
    private boolean hasAccess = true; 

    @Override
    public void performAnalysis() {
        if (!hasAccess) {
            logger.warning("Access denied: User does not have permission to perform analysis.");
            return;
        }

        if (!isAnalysisPerformed) {
            if (realStructuralDesign == null) {
                logger.info("Initializing RealStructuralDesign.");
                realStructuralDesign = new RealStructuralDesign();
            }
            logger.info("Proxy: Delegating to RealStructuralDesign.");
            long startTime = System.currentTimeMillis();
            realStructuralDesign.performAnalysis();
            long endTime = System.currentTimeMillis();
            logger.info("Proxy: Analysis took " + (endTime - startTime) + " milliseconds.");
            isAnalysisPerformed = true;
        } else {
            logger.info("Proxy: Analysis has already been performed.");
        }
    }

   
    public void setAccess(boolean access) {
        this.hasAccess = access;
    }
}
