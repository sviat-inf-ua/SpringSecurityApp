package ua.inf.sviat.springsecurityapp.editor;

import ua.inf.sviat.springsecurityapp.model.ProducerGpu;
import ua.inf.sviat.springsecurityapp.service.ProducerGpuService;

import java.beans.PropertyEditorSupport;

/**
 * Created by Sviatoslav on 26.04.2017.
 */
public class ProducerGpuEditor extends PropertyEditorSupport{

    private final ProducerGpuService service;

    public ProducerGpuEditor(ProducerGpuService service) {
        super();
        this.service = service;
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        ProducerGpu producerGpu = service.findOne(Long.valueOf(text));
        setValue(producerGpu);
    }
}
