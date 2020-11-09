import React, {TextareaHTMLAttributes} from 'react'

import './styles.css';

//PEGO TODAS AS PROPRIEDADES DO ELEMENTO Textarea DO HTML
interface TextareaProps extends TextareaHTMLAttributes<HTMLTextAreaElement> {
    name: string;
    label: string;
}
//quando uso interface transformo function Input em const Input
                                    //poderia ser props as variaveis abaixo
                                    //...rest todas as propriedades do input
                                    // exceto label e name
const Textarea: React.FC<TextareaProps> = ({label, name, ...rest }) => {
    return (
        <div className="textarea-block">
            <label htmlFor={name}>{label}</label>
            <textarea id={name} {...rest}/> {/* rest pega todas prop do input*/ }
        </div>

    );
}

export default Textarea;